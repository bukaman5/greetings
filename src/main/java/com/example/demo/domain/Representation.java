package com.example.demo.domain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Representation {

    @Setter
    @Getter
    private long id;
    private String content;

    public Representation(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
