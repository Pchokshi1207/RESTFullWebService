package org.studyeasy.showroom.model;


public class ErrorPayload {
	private int statusCode;
	private String message;
	public ErrorPayload() {
		
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorPayload(int statusCode, String message) {
		
		this.statusCode = statusCode;
		this.message = message;
	}
	

}
