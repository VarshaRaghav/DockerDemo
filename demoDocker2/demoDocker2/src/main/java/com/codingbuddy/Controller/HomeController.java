package com.codingbuddy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HomeController
{
    @GetMapping
    public String home()
    {
        return "Docker Demo Image Push First try!!";
    }
}
