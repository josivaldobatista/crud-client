package com.jfb.crudclient.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Instant timesStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public Instant getTimesStamp() {
        return this.timesStamp;
    }

    public void setTimesStamp(Instant timesStamp) {
        this.timesStamp = timesStamp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
