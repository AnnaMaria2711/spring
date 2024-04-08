package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @GetMapping("/hallooooo")
    public String myEndpoint(){
        return "hallo Welt!";
    }

}
