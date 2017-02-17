package co.writepath;

import java.util.List;

/**
 * Batched job server reply container
 */
public class BatchReply {
	/**
	 * set to either "ok" or "error". If an error occurs, check
	 * {@link co.writepath.Response#errorCode} and
	 * {@link co.writepath.Response#errorMessage}
	 */
	private String opStatus;
	/**
	 * Container for server return values
	 */
	private List<Response> response;
	/**
	 * Container for server return batch ID
	 */
	private String batchId;
	
	public String getBatchId() {
		return batchId;
	}
	
	public void setBatchId(String bId) {
		this.batchId = bId;
	}
	
	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

}
