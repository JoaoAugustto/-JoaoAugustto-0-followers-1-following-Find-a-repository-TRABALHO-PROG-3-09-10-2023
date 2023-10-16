package com.joaopaulo.demo.model;
public class Client {
    private String name;
    private String surname;
    private Integer document;
    private Integer clientId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientId() {
        return clientId;
    }
}
