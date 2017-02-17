package co.writepath;

import java.util.List;

/**
 * Response container object. Different fields are set by the server depending
 * on the type of query. In case of error, {@link co.writepath.Response#errorCode} and {@link co.writepath.Response#errorMessage} are set.
 * Please see http://www.writepath.co/en/developers
 *
 */
public class Response {
	/**
	 * Numerical error code
	 */
	private int errorCode;
	/**
	 * Error message string
	 */
	private String errorMessage;
	/**
	 * Word count of a query (plain text or document)
	 */
	private int wordCount;
	/**
	 * WritePath order id of job
	 */
	private int orderId;
	/**
	 * Number of words used in job
	 */
	private int wordsUsed;
	/**
	 * Status of the job
	 */
	private String status;
	/**
	 * Due date of the job
	 */
	private String dueDate;
	/**
	 * Current word balance of user
	 */
	private int wordsBalance;
	/**
	 * Returned document in base64 encoding
	 */
	private String document;
	/**
	 * Comment by editor
	 */
	private String commentFinished;
	/**
	 * Set when querying for languages
	 */
	private List<String> langArray;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getWordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getWordsUsed() {
		return wordsUsed;
	}

	public void setWordsUsed(int wordsUsed) {
		this.wordsUsed = wordsUsed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getWordsBalance() {
		return wordsBalance;
	}

	public void setWordsBalance(int wordsBalance) {
		this.wordsBalance = wordsBalance;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public List<String> getLangArray() {
		return langArray;
	}

	public void setLangArray(List<String> langArray) {
		this.langArray = langArray;
	}

	public String getCommentFinished() {
		return commentFinished;
	}

	public void setCommentFinished(String commentFinished) {
		this.commentFinished = commentFinished;
	}

}
