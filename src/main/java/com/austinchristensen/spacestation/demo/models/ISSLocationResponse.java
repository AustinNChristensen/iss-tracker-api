package com.austinchristensen.spacestation.demo.models;

public class ISSLocationResponse {
    private long timestamp;
    private String message;
    private ISSPosition iss_position;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ISSPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISSPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "ISSLocationResponse{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", iss_position=" + iss_position +
                '}';
    }
}
