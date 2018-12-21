package com.example.concurrent.controller;

/**
 * @ClassName Result
 * @Description TODO
 * @Author missj
 * @Date 2018/12/11 10:31
 * @Version 1.0
 */
public class Result {
    private boolean success = false;
    private String message = null;
    

    public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
