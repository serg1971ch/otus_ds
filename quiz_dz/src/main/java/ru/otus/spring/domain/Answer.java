package ru.otus.spring.domain;

public class Answer {
    private int id;
    private String response;
    private TypeResponse type;

    public Answer(int id, String response, TypeResponse type) {
        this.id = id;
        this.response = response;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setType(TypeResponse type) {
        this.type = type;
    }

    public TypeResponse getType() {
        return type;
    }
}
