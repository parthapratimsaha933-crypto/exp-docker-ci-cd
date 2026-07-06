package org.partha.expdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/intro")
    public String helloWorld(){
        return "Hello world";
    }
}
