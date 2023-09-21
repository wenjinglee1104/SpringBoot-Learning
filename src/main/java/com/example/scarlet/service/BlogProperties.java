package com.example.scarlet.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class BlogProperties {

    @Value("${com.example.scarlet.blog.name}")
    private String name;

    @Value("${com.example.scarlet.blog.title}")
    private String title;

    @Value("${com.example.scarlet.blog.desc}")
    private String desc;

    @Value("${com.example.scarlet.blog.value}")
    private String value;

    @Value("${com.example.scarlet.blog.number}")
    private Integer number;

    @Value("${com.example.scarlet.blog.bignumber}")
    private Long bignumber;

    @Value("${com.example.scarlet.blog.test1}")
    private Integer test1;

    @Value("${com.example.scarlet.blog.test2}")
    private Integer test2;
}
