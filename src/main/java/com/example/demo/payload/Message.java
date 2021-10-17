package com.example.demo.payload;

public class Message {

    private String event;
    private Object content;

    public Message() {
        super();
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
