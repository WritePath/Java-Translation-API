package co.writepath;

/**
 * Generic server reply container
 */
public class Reply {
	/**
	 * set to either "ok" or "error". If an error occurs, check
	 * {@link co.writepath.Response#errorCode} and
	 * {@link co.writepath.Response#errorMessage}
	 */
	private String opStatus;
	/**
	 * Container for server return values
	 */
	private Response response;

	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

}
