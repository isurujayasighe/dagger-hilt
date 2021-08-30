package com.covalent.uk.daggerhiltapp.repository.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("responseBody")
    @Expose
    private String responseBody;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}
