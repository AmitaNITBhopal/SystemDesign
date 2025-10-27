package com.systemdesign.BasicLOSOnAzure.dto;

import java.time.LocalDateTime;

//import org.springframework.http.HttpStatusCode;

//import org.springframework.http.HttpStatus;


public class ErrorResponseDto {
	
	private  String apiPath;

    //private HttpStatusCode errorCode;

    private  String errorMessage;

    private LocalDateTime errorTime;

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(LocalDateTime errorTime) {
		this.errorTime = errorTime;
	}

	@Override
	public String toString() {
		return "ErrorResponseDto [apiPath=" + apiPath + ", errorMessage=" + errorMessage + ", errorTime=" + errorTime
				+ "]";
	}
}
