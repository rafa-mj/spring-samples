package com.rmj.resteasy.sample.api.v1;

public class ApiException extends Exception {

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable t) {
        super(message, t);
    }
}
