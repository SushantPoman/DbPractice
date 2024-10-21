package com.cyb.model;

import java.time.LocalDateTime;

public class ErrorInfo {
	private String errorMsg;
	private Integer errorCode;
	private LocalDateTime errorDateTime;
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public LocalDateTime getErrorDateTime() {
		return errorDateTime;
	}
	public void setErrorDateTime(LocalDateTime errorDateTime) {
		this.errorDateTime = errorDateTime;
	}
	
	

}
