package com.example.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.*;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
/**
 * Created by omprakash.yadav on 07/02/16.
 */
public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    @Getter
    @Setter
    @JsonProperty
    private String template ;

    @NotEmpty
    @Getter
    @Setter
    @JsonProperty
    private String defaultName = "Strange";








}
