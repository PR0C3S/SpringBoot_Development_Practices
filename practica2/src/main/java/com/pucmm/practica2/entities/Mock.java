package com.pucmm.practica2.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Mock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description = "";
    private String endPointPath = "";
    private String accessMethod = "";
    private String httpStatus = "";
    private String responseContentType = "";
    private String charset = "";
    private String httpHeaders = "";
    private String httpResponseBody = "";
    private String secretToken = "";
    private String mockIdentifier = "";
    private int expiryTime;
    private int timeDelay;

    protected Mock() {}

    public Mock(String name, String description, String endPointPath, String accessMethod, String httpStatus, String responseContentType, String charset, String httpHeaders, String httpResponseBody, String secretToken, String mockIdentifier, int expiryTime, int timeDelay) {
        this.name = name;
        this.description = description;
        this.endPointPath = endPointPath;
        this.accessMethod = accessMethod;
        this.httpStatus = httpStatus;
        this.responseContentType = responseContentType;
        this.charset = charset;
        this.httpHeaders = httpHeaders;
        this.httpResponseBody = httpResponseBody;
        this.secretToken = secretToken;
        this.mockIdentifier = mockIdentifier;
        this.expiryTime = expiryTime;
        this.timeDelay = timeDelay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndPointPath() {
        return endPointPath;
    }

    public void setEndPointPath(String endPointPath) {
        this.endPointPath = endPointPath;
    }

    public String getAccessMethod() {
        return accessMethod;
    }

    public void setAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getResponseContentType() {
        return responseContentType;
    }

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getHttpResponseBody() {
        return httpResponseBody;
    }

    public void setHttpResponseBody(String httpResponseBody) {
        this.httpResponseBody = httpResponseBody;
    }

    public String getSecretToken() {
        return secretToken;
    }

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    public String getMockIdentifier() {
        return mockIdentifier;
    }

    public void setMockIdentifier(String mockIdentifier) {
        this.mockIdentifier = mockIdentifier;
    }

    public int getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(int expiryTime) {
        this.expiryTime = expiryTime;
    }

    public int getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(int timeDelay) {
        this.timeDelay = timeDelay;
    }

}
