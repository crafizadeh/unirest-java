package com.mashape.client.http.response;

import java.util.Arrays;

import org.apache.http.HttpResponse;


public class MashapeResponse<T> {
	private int code;
	private String headers;
	private String rawBody;
	private T body;

	public MashapeResponse(HttpResponse response, String rawBody, T body) {
		this.headers = Arrays.toString(response.getAllHeaders());
		this.code = response.getStatusLine().getStatusCode();
		this.rawBody = rawBody;
		this.body = body;
	}

	public int getCode() {
		return code;
	}
	public String getHeaders() {
		return headers;
	}
	public String getRawBody() {
		return rawBody;
	}
	public T getBody() {
		return body;
	}
}
