package com.immortal.jpademo.producer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class KafkaMessage {

    String msg;
    String name;

    public KafkaMessage() {
    }

    public KafkaMessage(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    @Override
    public String toString() {
        return "KafkaMessage{" +
                "msg='" + msg + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
