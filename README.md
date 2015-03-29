WritePath Translation API (Java)
==============================

With the WritePath Translation API and Proofreading API, developers can easily access a large number of experienced translators & editors with industry expertise in more than 35 languages. This API offers an easy and efficient way to integrate translation into your backend system, user interface, document management system, web shop, website content management system (CMS), mobile app, etc. It helps to automate repeating processes, cuts down process costs and gives you more time to focus on your core business.

For details check the <a href="https://www.writepath.co/en/developers">Java translation API</a> documentation.
It takes care of authorization, JSON encoding and decoding and it can do a few more very convenient things.

<h2>Getting started:</h2>
<a href="https://www.writepath.co/en/signup">Sign up</a> at writepath.co and request your API keys.

<!-- ======== START OF CLASS DATA ======== -->
<div class="header">
<div class="subTitle">co.writepath</div>
<h2 title="Class Cdivent" class="title">Class Cdivent</h2>
</div>
<div class="contentContainer">
<div class="inheritance">
<div>java.lang.Object</div>
<div>
<div class="inheritance">
<div>co.writepath.Cdivent</div>
</div>
</div>
</div>
<div class="description">
<div class="blockdivst">
<div class="blockdivst">
<hr>
<br>
<pre>pubdivc class <span class="typeNameLabel">Cdivent</span>
extends java.lang.Object</pre>
<div class="block">Java cdivent for WritePath that maps all API functions. For detailed
 explanations of the API, please visit https://www.writepath.co/en/developers</div>
</div>
</div>
</div>
<div class="summary">
<div class="blockdivst">
<div class="blockdivst">
<!-- =========== FIELD SUMMARY =========== -->
<div class="blockdivst">
<div class="blockdivst"><a name="field.summary">
<!--   -->
</a>
<h3>Field Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Field Summary table, divsting fields, and an explanation">
<caption><span>Fields</span><span class="tabEnd">&nbsp;</span></caption>
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Field and Description</th>
</tr>
<tr class="altColor">
<td class="colFirst"><code>private java.lang.String</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#apiKey">apiKey</a></span></code>
<div class="block">Your API key</div>
</td>
</tr>
<tr class="rowColor">
<td class="colFirst"><code>private com.fasterxml.jackson.databind.ObjectMapper</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#objectMapper">objectMapper</a></span></code>&nbsp;</td>
</tr>
<tr class="altColor">
<td class="colFirst"><code>private java.lang.String</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#privateKey">privateKey</a></span></code>
<div class="block">Your private API key</div>
</td>
</tr>
<tr class="rowColor">
<td class="colFirst"><code>private java.lang.String</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#url">url</a></span></code>
<div class="block">Address of API</div>
</td>
</tr>
</table>
</div>
</div>
<!-- ======== CONSTRUCTOR SUMMARY ======== -->
<div class="blockdivst">
<div class="blockdivst"><a name="constructor.summary">
<!--   -->
</a>
<h3>Constructor Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Constructor Summary table, divsting constructors, and an explanation">
<caption><span>Constructors</span><span class="tabEnd">&nbsp;</span></caption>
<tr>
<th class="colOne" scope="col">Constructor and Description</th>
</tr>
<tr class="altColor">
<td class="colOne"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#Cdivent-java.lang.String-java.lang.String-">Cdivent</a></span>(java.lang.String&nbsp;apiKey,
      java.lang.String&nbsp;privateKey)</code>
<div class="block">Instantiate new Cdivent with your pubdivc and private API key set</div>
</td>
</tr>
</table>
</div>
</div>
<!-- ========== METHOD SUMMARY =========== -->
<div class="blockdivst">
<div class="blockdivst"><a name="method.summary">
<!--   -->
</a>
<h3>Method Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Method Summary table, divsting methods, and an explanation">
<caption><span id="t0" class="activeTableTab"><span>All Methods</span><span class="tabEnd">&nbsp;</span></span><span id="t1" class="tableTab"><span><a href="javascript:show(1);">Static Methods</a></span><span class="tabEnd">&nbsp;</span></span><span id="t2" class="tableTab"><span><a href="javascript:show(2);">Instance Methods</a></span><span class="tabEnd">&nbsp;</span></span><span id="t4" class="tableTab"><span><a href="javascript:show(8);">Concrete Methods</a></span><span class="tabEnd">&nbsp;</span></span></caption>
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Method and Description</th>
</tr>
<tr id="i0" class="altColor">
<td class="colFirst"><code>private java.lang.String</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#encodeFileToBase64Binary-java.lang.String-">encodeFileToBase64Binary</a></span>(java.lang.String&nbsp;fileName)</code>&nbsp;</td>
</tr>
<tr id="i1" class="rowColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#getLanguages-int-">getLanguages</a></span>(int&nbsp;service)</code>
<div class="block">Fetch the divst of supported languages</div>
</td>
</tr>
<tr id="i2" class="altColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#getStatus-int-int-">getStatus</a></span>(int&nbsp;jobId,
         int&nbsp;format)</code>
<div class="block">Retrieves a specific job.</div>
</td>
</tr>
<tr id="i3" class="rowColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#getWordBalance--">getWordBalance</a></span>()</code>
<div class="block">Fetch the word balance for the user</div>
</td>
</tr>
<tr id="i4" class="altColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#getWordCountDocument-int-int-java.lang.String-">getWordCountDocument</a></span>(int&nbsp;service,
                    int&nbsp;langId,
                    java.lang.String&nbsp;fileName)</code>
<div class="block">Fetch the word count for .docx, .xlsx or .pptx documents</div>
</td>
</tr>
<tr id="i5" class="rowColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#getWordCountPlainText-int-int-java.lang.String-">getWordCountPlainText</a></span>(int&nbsp;service,
                     int&nbsp;langId,
                     java.lang.String&nbsp;text)</code>
<div class="block">Fetch the word document for plain text</div>
</td>
</tr>
<tr id="i6" class="altColor">
<td class="colFirst"><code>private static java.lang.String</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#hmacSha1-java.lang.String-java.lang.String-">hmacSha1</a></span>(java.lang.String&nbsp;value,
        java.lang.String&nbsp;key)</code>&nbsp;</td>
</tr>
<tr id="i7" class="rowColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#postComment-int-java.lang.String-">postComment</a></span>(int&nbsp;jobId,
           java.lang.String&nbsp;comment)</code>
<div class="block">Post a comment on a job</div>
</td>
</tr>
<tr id="i8" class="altColor">
<td class="colFirst"><code>private org.apache.http.cdivent.methods.HttpPost</code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#preparePost-java.lang.String-co.writepath.Data-">preparePost</a></span>(java.lang.String&nbsp;url,
           <a href="../../co/writepath/Data.html" title="class in co.writepath">Data</a>&nbsp;data)</code>&nbsp;</td>
</tr>
<tr id="i9" class="rowColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#sendDocument-int-int-int-java.lang.String-java.lang.String-java.lang.String-">sendDocument</a></span>(int&nbsp;service,
            int&nbsp;langId,
            int&nbsp;category,
            java.lang.String&nbsp;fileName,
            java.lang.String&nbsp;instructions,
            java.lang.String&nbsp;notifyUrl)</code>
<div class="block">Send a job with file attachment to the service</div>
</td>
</tr>
<tr id="i10" class="altColor">
<td class="colFirst"><code><a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a></code></td>
<td class="colLast"><code><span class="memberNamedivnk"><a href="../../co/writepath/Cdivent.html#sendPlainText-int-int-int-java.lang.String-java.lang.String-java.lang.String-">sendPlainText</a></span>(int&nbsp;service,
             int&nbsp;langId,
             int&nbsp;category,
             java.lang.String&nbsp;text,
             java.lang.String&nbsp;instructions,
             java.lang.String&nbsp;notifyUrl)</code>
<div class="block">Send a job with plain text to the service.</div>
</td>
</tr>
</table>
<div class="blockdivst">
<div class="blockdivst"><a name="methods.inherited.from.class.java.lang.Object">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;java.lang.Object</h3>
<code>clone, equals, finadivze, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait</code></div>
</div>
</div>
</div>
</div>
</div>
</div>
<div class="details">
<div class="blockdivst">
<div class="blockdivst">
<!-- ============ FIELD DETAIL =========== -->
<div class="blockdivst">
<div class="blockdivst"><a name="field.detail">
<!--   -->
</a>
<h3>Field Detail</h3>
<a name="url">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>url</h4>
<pre>private&nbsp;java.lang.String url</pre>
<div class="block">Address of API</div>
</div>
</div>
<a name="apiKey">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>apiKey</h4>
<pre>private&nbsp;java.lang.String apiKey</pre>
<div class="block">Your API key</div>
</div>
</div>
<a name="privateKey">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>privateKey</h4>
<pre>private&nbsp;java.lang.String privateKey</pre>
<div class="block">Your private API key</div>
</div>
</div>
<a name="objectMapper">
<!--   -->
</a>
<div class="blockdivstLast">
<div class="blockdivst">
<h4>objectMapper</h4>
<pre>private&nbsp;com.fasterxml.jackson.databind.ObjectMapper objectMapper</pre>
</div>
</div>
</div>
</div>
<!-- ========= CONSTRUCTOR DETAIL ======== -->
<div class="blockdivst">
<div class="blockdivst"><a name="constructor.detail">
<!--   -->
</a>
<h3>Constructor Detail</h3>
<a name="Cdivent-java.lang.String-java.lang.String-">
<!--   -->
</a>
<div class="blockdivstLast">
<div class="blockdivst">
<h4>Cdivent</h4>
<pre>pubdivc&nbsp;Cdivent(java.lang.String&nbsp;apiKey,
              java.lang.String&nbsp;privateKey)</pre>
<div class="block">Instantiate new Cdivent with your pubdivc and private API key set</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>apiKey</code> - Pubdivc API key</dd>
<dd><code>privateKey</code> - Private API key</dd>
</dl>
</div>
</div>
</div>
</div>
<!-- ============ METHOD DETAIL ========== -->
<div class="blockdivst">
<div class="blockdivst"><a name="method.detail">
<!--   -->
</a>
<h3>Method Detail</h3>
<a name="preparePost-java.lang.String-co.writepath.Data-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>preparePost</h4>
<pre>private&nbsp;org.apache.http.cdivent.methods.HttpPost&nbsp;preparePost(java.lang.String&nbsp;url,
                                                            <a href="../../co/writepath/Data.html" title="class in co.writepath">Data</a>&nbsp;data)
                                                     throws java.io.UnsupportedEncodingException,
                                                            com.fasterxml.jackson.core.JsonProcessingException</pre>
<dl>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.UnsupportedEncodingException</code></dd>
<dd><code>com.fasterxml.jackson.core.JsonProcessingException</code></dd>
</dl>
</div>
</div>
<a name="encodeFileToBase64Binary-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>encodeFileToBase64Binary</h4>
<pre>private&nbsp;java.lang.String&nbsp;encodeFileToBase64Binary(java.lang.String&nbsp;fileName)</pre>
</div>
</div>
<a name="hmacSha1-java.lang.String-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>hmacSha1</h4>
<pre>private static&nbsp;java.lang.String&nbsp;hmacSha1(java.lang.String&nbsp;value,
                                         java.lang.String&nbsp;key)</pre>
</div>
</div>
<a name="sendPlainText-int-int-int-java.lang.String-java.lang.String-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>sendPlainText</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;sendPlainText(int&nbsp;service,
                           int&nbsp;langId,
                           int&nbsp;category,
                           java.lang.String&nbsp;text,
                           java.lang.String&nbsp;instructions,
                           java.lang.String&nbsp;notifyUrl)
                    throws java.io.IOException</pre>
<div class="block">Send a job with plain text to the service.</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>service</code> - The service you require: 1 = editing, 2 = translation only, 4
            = premium translation (translation + editing)</dd>
<dd><code>langId</code> - The id of the translation / editing language.</dd>
<dd><code>category</code> - The category / topic your text is about.</dd>
<dd><code>text</code> - the text you wodivd divke to have translated or edited. Can
            include HTML tags, these are not counted as words.</dd>
<dd><code>instructions</code> - instructions for the translator / editor.</dd>
<dd><code>notifyUrl</code> - When job is finished, a REST post is sent to that URL</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with wordsUsed and orderId set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="sendDocument-int-int-int-java.lang.String-java.lang.String-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>sendDocument</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;sendDocument(int&nbsp;service,
                          int&nbsp;langId,
                          int&nbsp;category,
                          java.lang.String&nbsp;fileName,
                          java.lang.String&nbsp;instructions,
                          java.lang.String&nbsp;notifyUrl)
                   throws java.io.IOException</pre>
<div class="block">Send a job with file attachment to the service</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>service</code> - The service you require: 1 = editing, 2 = translation only, 4
            = premium translation (translation + editing)</dd>
<dd><code>langId</code> - The id of the translation / editing language.</dd>
<dd><code>category</code> - The category / topic your text is about.</dd>
<dd><code>fileName</code> - The path + filename of your document (only .docx, .pptx,
            .xlsx)</dd>
<dd><code>instructions</code> - instructions for the translator / editor.</dd>
<dd><code>notifyUrl</code> - When job is finished, a REST post is sent to that URL</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with wordsUsed and orderId set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="getStatus-int-int-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>getStatus</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;getStatus(int&nbsp;jobId,
                       int&nbsp;format)
                throws java.io.IOException</pre>
<div class="block">Retrieves a specific job.</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>jobId</code> - id of the job you want to fetch. It's the orderId you get
            returned if you post a job.</dd>
<dd><code>format</code> - The format of the returned content. 1 = as a file, 2 = as
            plain text</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with wordsUsed, status, dueDate, wordsBalance,
         commentFinished and document set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="postComment-int-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>postComment</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;postComment(int&nbsp;jobId,
                         java.lang.String&nbsp;comment)
                  throws java.io.IOException</pre>
<div class="block">Post a comment on a job</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>jobId</code> - The id of the job (= orderId) you want to comment on.</dd>
<dd><code>comment</code> - Your comment</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with empty response</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="getLanguages-int-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>getLanguages</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;getLanguages(int&nbsp;service)
                   throws java.io.IOException</pre>
<div class="block">Fetch the divst of supported languages</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>service</code> - id of service needed</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with langArray set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="getWordBalance--">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>getWordBalance</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;getWordBalance()
                     throws java.io.IOException</pre>
<div class="block">Fetch the word balance for the user</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with words balance set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="getWordCountPlainText-int-int-java.lang.String-">
<!--   -->
</a>
<div class="blockdivst">
<div class="blockdivst">
<h4>getWordCountPlainText</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;getWordCountPlainText(int&nbsp;service,
                                   int&nbsp;langId,
                                   java.lang.String&nbsp;text)
                            throws java.io.IOException</pre>
<div class="block">Fetch the word document for plain text</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>service</code> - The service you require: 1 = editing, 2 = translation only, 4
            = premium translation (translation + editing)</dd>
<dd><code>langId</code> - The id of the translation / editing language.</dd>
<dd><code>text</code> - the text you wodivd divke to have translated or edited. Can
            include HTML tags, these are not counted as words.</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with word count set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
<a name="getWordCountDocument-int-int-java.lang.String-">
<!--   -->
</a>
<div class="blockdivstLast">
<div class="blockdivst">
<h4>getWordCountDocument</h4>
<pre>pubdivc&nbsp;<a href="../../co/writepath/Reply.html" title="class in co.writepath">Reply</a>&nbsp;getWordCountDocument(int&nbsp;service,
                                  int&nbsp;langId,
                                  java.lang.String&nbsp;fileName)
                           throws java.io.IOException</pre>
<div class="block">Fetch the word count for .docx, .xlsx or .pptx documents</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>service</code> - The service you require: 1 = editing, 2 = translation only, 4
            = premium translation (translation + editing)</dd>
<dd><code>langId</code> - The id of the translation / editing language.</dd>
<dd><code>fileName</code> - path of file that needs to be checked</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>server reply with word count set</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.IOException</code> - in case of network or json mapping issues</dd>
</dl>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<!-- ========= END OF CLASS DATA ========= -->
