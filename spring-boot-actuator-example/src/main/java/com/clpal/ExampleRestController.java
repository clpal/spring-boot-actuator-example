package com.clpal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {
    @GetMapping("/demo")
    public String demo(){
        return "Spring Boot Actuator example Created By\n Chhote Lal Pal !!";

    }

}
