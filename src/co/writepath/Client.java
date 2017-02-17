package co.writepath;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator.Feature;


/**
 * Java client for WritePath that maps all API functions. For detailed
 * explanations of the API, please visit http://www.writepath.co/en/developers
 *
 */
public class Client {
	/**
	 * Address of API
	 */
	//private String url = "https://www.writepath.co/api";
	private String url = "http://writepathco.localhost/api";
	/**
	 * Your API key
	 */
	private String apiKey = "";
	/**
	 * Your private API key
	 */
	private String privateKey = "";
	private ObjectMapper objectMapper;

	/**
	 * Instantiate new Client with your public and private API key set
	 * @param apiKey Public API key
	 * @param privateKey Private API key
	 */
	public Client(String apiKey, String privateKey) {
		this.apiKey = apiKey;
		this.privateKey = privateKey;
		this.objectMapper = new ObjectMapper();
		this.objectMapper.configure(Feature.ESCAPE_NON_ASCII, true);
	}

	private HttpPost preparePost(String url, Data data)
			throws UnsupportedEncodingException, JsonProcessingException {
		String dataString = "";
		if (data != null) {			
			dataString = objectMapper.writeValueAsString(data);
		}
		HttpPost httpPost = new HttpPost(this.url + url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("api_key", apiKey));
		String ts = Long.toString(System.currentTimeMillis() / 1000L);
		nvps.add(new BasicNameValuePair("ts", ts));
		nvps.add(new BasicNameValuePair("data", dataString));
		String hmac = hmacSha1(ts, this.privateKey);
		nvps.add(new BasicNameValuePair("api_sig", hmac));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));

		return httpPost;
	}

	private String encodeFileToBase64Binary(String fileName) {
		String encodedfile = null;
		try {
			encodedfile = new String(Base64.encodeBase64(FileUtils
					.readFileToByteArray(new File(fileName))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return encodedfile;
	}

	private static String hmacSha1(String value, String key) {
		try {
			// Get an hmac_sha1 key from the raw key bytes
			byte[] keyBytes = key.getBytes();
			SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");

			// Get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance("HmacSHA1");
			mac.init(signingKey);

			// Compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(value.getBytes());

			// Convert raw bytes to Hex
			byte[] hexBytes = new Hex().encode(rawHmac);

			// Covert array of Hex bytes to a String
			return new String(hexBytes, "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Send a job with plain text to the service.
	 *
	 * @param service
	 *            The service you require: 1 = editing, 2 = translation only, 4
	 *            = premium translation (translation + editing)
	 * @param langId
	 *            The id of the translation / editing language.
	 * @param category
	 *            The category / topic your text is about.
	 * @param text
	 *            the text you would like to have translated or edited. Can
	 *            include HTML tags, these are not counted as words.
	 * @param instructions
	 *            instructions for the translator / editor.
	 * @param notifyUrl
	 *            When job is finished, a REST post is sent to that URL
	 * @return server reply with wordsUsed and orderId set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply sendPlainText(int service, int langId, int category,
			String text, String instructions, String notifyUrl)
			throws IOException {
		if (text.trim().length() == 0) {
			return null;
		}

		Map<String, String> job = new HashMap<String, String>();
		job.put("service", Integer.toString(service));
		job.put("langID", Integer.toString(langId));
		job.put("category", Integer.toString(category));
		job.put("body", text);
		job.put("instructions", instructions);
		job.put("notify_url", notifyUrl);

		Data data = new Data();
		data.setJob(job);

		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/jobs", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}
	
	/**
	 * Send batched jobs with plain text to the service.
	 *
	 * @param service
	 *            The service you require: 1 = editing, 2 = translation only, 4
	 *            = premium translation (translation + editing)
	 * @param langId
	 *            The id of the translation / editing language.
	 * @param category
	 *            The category / topic your text is about.
	 * @param text
	 *            the list of text you would like to have translated or edited. Can
	 *            include HTML tags, these are not counted as words.
	 * @param instructions
	 *            instructions for the translator / editor.
	 * @param notifyUrl
	 *            When job is finished, a REST post is sent to that URL
	 * @return server reply with wordsUsed and orderId set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public BatchReply sendBatchedPlainText(int service, int langId, int category,
			List<String> text, String instructions, String notifyUrl)
			throws IOException {
		if (text.size() <= 0) {
			return null;
		}

		Map<String, String> job = new HashMap<String, String>();
		job.put("service", Integer.toString(service));
		job.put("langID", Integer.toString(langId));
		job.put("category", Integer.toString(category));
		this.objectMapper.configure(Feature.ESCAPE_NON_ASCII, false);
		job.put("body", objectMapper.writeValueAsString(text));
		this.objectMapper.configure(Feature.ESCAPE_NON_ASCII, true);
		job.put("instructions", instructions);
		job.put("notify_url", notifyUrl);

		Data data = new Data();
		data.setJob(job);

		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/bjobs", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		BatchReply reply = objectMapper.readValue(returnString, BatchReply.class);

		return reply;
	}

	/**
	 * Send a job with file attachment to the service
	 *
	 * @param service
	 *            The service you require: 1 = editing, 2 = translation only, 4
	 *            = premium translation (translation + editing)
	 * @param langId
	 *            The id of the translation / editing language.
	 * @param category
	 *            The category / topic your text is about.
	 * @param fileName
	 *            The path + filename of your document (only .docx, .pptx,
	 *            .xlsx)
	 * @param instructions
	 *            instructions for the translator / editor.
	 * @param notifyUrl
	 *            When job is finished, a REST post is sent to that URL
	 * @return server reply with wordsUsed and orderId set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply sendDocument(int service, int langId, int category,
			String fileName, String instructions, String notifyUrl)
			throws IOException {

		Map<String, String> job = new HashMap<String, String>();
		job.put("service", Integer.toString(service));
		job.put("langID", Integer.toString(langId));
		job.put("category", Integer.toString(category));
		job.put("filename", new File(fileName).getName());
		job.put("document", encodeFileToBase64Binary(fileName));
		job.put("instructions", instructions);
		job.put("notify_url", notifyUrl);

		Data data = new Data();
		data.setJob(job);

		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/jobs", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}

	/**
	 * Retrieves a specific job.
	 *
	 * @param jobId
	 *            id of the job you want to fetch. It's the orderId you get
	 *            returned if you post a job.
	 * @param format
	 *            The format of the returned content. 1 = as a file, 2 = as
	 *            plain text
	 * @return server reply with wordsUsed, status, dueDate, wordsBalance,
	 *         commentFinished and document set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply getStatus(int jobId, int format) throws IOException {
		Data data = new Data();
		data.setFormat(format);
		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/jobs/" + jobId, data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}
	
	/**
	 * Retrieves a set of batched jobs.
	 *
	 * @param batchId
	 *            id of the batched jobs you want to fetch. It's the orderId 
	 *            you get returned if you post a job.
	 * @param format
	 *            The format of the returned content. 1 = as a file, 2 = as
	 *            plain text
	 * @return server reply with wordsUsed, status, dueDate, wordsBalance,
	 *         commentFinished and document set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public BatchReply getBatchedStatus(int batchId, int format) throws IOException {
		Data data = new Data();
		data.setFormat(format);
		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/bjobs/" + batchId, data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		BatchReply reply = objectMapper.readValue(returnString, BatchReply.class);

		return reply;
	}

	/**
	 * Post a comment on a job
	 *
	 * @param jobId
	 *            The id of the job (= orderId) you want to comment on.
	 * @param comment
	 *            Your comment
	 * @return server reply with empty response
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply postComment(int jobId, String comment) throws IOException {
		Data data = new Data();
		data.setComment(comment);
		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/jobs/" + jobId + "/comment", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}

	/**
	 * Fetch the list of supported languages
	 *
	 * @param service
	 *            id of service needed
	 * @return server reply with langArray set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply getLanguages(int service) throws IOException {
		Data data = new Data();
		data.setService(service);
		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/languages", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}

	/**
	 * Fetch the word balance for the user
	 *
	 * @return server reply with words balance set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply getWordBalance() throws IOException {
		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/balance", null);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}

	/**
	 * Fetch the word document for plain text
	 *
	 * @param service
	 *            The service you require: 1 = editing, 2 = translation only, 4
	 *            = premium translation (translation + editing)
	 * @param langId
	 *            The id of the translation / editing language.
	 * @param text
	 *            the text you would like to have translated or edited. Can
	 *            include HTML tags, these are not counted as words.
	 * @return server reply with word count set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply getWordCountPlainText(int service, int langId, String text)
			throws IOException {
		Map<String, String> job = new HashMap<String, String>();
		job.put("service", Integer.toString(service));
		job.put("langID", Integer.toString(langId));
		job.put("body", text);

		Data data = new Data();
		data.setJob(job);

		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/wordcount", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}

	/**
	 * Fetch the word count for .docx, .xlsx or .pptx documents
	 *
	 * @param service
	 *            The service you require: 1 = editing, 2 = translation only, 4
	 *            = premium translation (translation + editing)
	 * @param langId
	 *            The id of the translation / editing language.
	 * @param fileName
	 *            path of file that needs to be checked
	 * @return server reply with word count set
	 * @throws IOException
	 *             in case of network or json mapping issues
	 */
	public Reply getWordCountDocument(int service, int langId, String fileName)
			throws IOException {
		Map<String, String> job = new HashMap<String, String>();
		job.put("service", Integer.toString(service));
		job.put("langID", Integer.toString(langId));
		job.put("document", encodeFileToBase64Binary(fileName));
		job.put("filename", new File(fileName).getName());

		Data data = new Data();
		data.setJob(job);

		HttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = preparePost("/wordcount", data);
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity responseEntity = response.getEntity();
		String returnString = EntityUtils.toString(responseEntity);
		Reply reply = objectMapper.readValue(returnString, Reply.class);

		return reply;
	}
}
