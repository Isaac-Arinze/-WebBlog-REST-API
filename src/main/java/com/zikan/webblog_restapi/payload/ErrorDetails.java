package com.zikan.webblog_restapi.payload;

import java.sql.Timestamp;
import java.util.Date;

public class ErrorDetails {

    private Date Timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        Timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
