package com.thecodeaffairs.springboot_demo.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    private HttpStatus status;

    public ErrorMessage() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
