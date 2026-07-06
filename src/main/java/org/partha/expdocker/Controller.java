package org.partha.expdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MyService myService;

    @GetMapping("/api/intro")
    public String helloWorld(){
        return myService.helloWorld();
    }
}
