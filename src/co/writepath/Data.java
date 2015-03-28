package co.writepath;

import java.util.Map;

/**
 * Request object when querying the server.
 */
public class Data {
	/**
	 * 
	 */
	private Map<String, String> job;
	private String comment;
	private int format;
	private int service;

	public Map<String, String> getJob() {
		return job;
	}

	public void setJob(Map<String, String> job) {
		this.job = job;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

}
