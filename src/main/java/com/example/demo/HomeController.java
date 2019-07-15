package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @Autowired
    JobRepository jobRepository;

    @RequestMapping
}
