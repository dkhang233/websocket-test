package com.dkhang.webrtcDemo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getMethodName() {
        return "Home Page";
    }

}
