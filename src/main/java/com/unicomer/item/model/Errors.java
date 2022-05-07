package com.unicomer.item.model;

import lombok.Data;

@Data
public class Errors {

    private String code;
    private String id;
    private String title;
    private String detail;

    public Errors() {
    }

    public Errors(String code, String id, String title, String detail) {
        this.code = code;
        this.id = id;
        this.title = title;
        this.detail = detail;
    }
}
