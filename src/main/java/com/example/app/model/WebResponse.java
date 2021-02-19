package com.example.app.model;

public class WebResponse <T> {
    public int code;
    public String status;
    public T data;
    public WebResponse(int code, String status, T data){
        this.code = code;
        this.status = status;
        this.data = data;
    }
}
