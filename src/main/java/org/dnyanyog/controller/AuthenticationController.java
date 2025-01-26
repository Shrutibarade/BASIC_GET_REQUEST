package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/hello") // end point -> /hello
    public String hello() {
        return "Hellow";
    }

    @GetMapping("/challo") // end point -> /challo
    public String challo() {
        long date = System.currentTimeMillis();
        return "Hi there, chalo chalo " + date;
    }
}
