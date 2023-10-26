package com.example.springbootjasyptencryptiondecryption;

public enum AppConstants {

    SERVICE_IS_RUNNING("service is up and running");

    public final String message;

    AppConstants(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }
}
