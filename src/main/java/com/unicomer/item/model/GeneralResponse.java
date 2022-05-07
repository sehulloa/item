package com.unicomer.item.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

import java.util.List;

@Data
@JsonRootName("generalResponse")
public class GeneralResponse {

    private String responseCode;
    private String responseDescription;
    private List<Errors> errors;

    public GeneralResponse() {
    }

    public GeneralResponse(String responseCode, String responseDescription, List<Errors> errors) {
        super();
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
        this.errors = errors;
    }
}
