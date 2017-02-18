package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import org.glassfish.jersey.*;
/**
 * Created by omprakash.yadav on 07/02/16.
 */
public class Saying {

    @Getter
    @JsonProperty
    private long id;

    @Length(max = 3)
    @Getter
    @JsonProperty
    private String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
        System.out.println(this.content);
    }
    public void getSum(){

    }

}
