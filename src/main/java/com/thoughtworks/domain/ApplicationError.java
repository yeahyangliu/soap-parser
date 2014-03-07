package com.thoughtworks.domain;

/**
 * Created by tw on 3/7/14.
 */
public class ApplicationError {
    private String errorStatus;
    private String errorId;

    public String getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(String errorStatus) {
        this.errorStatus = errorStatus;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }
}
