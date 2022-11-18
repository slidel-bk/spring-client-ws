package com.example.clientWS.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class ConsumeController {

    @GetMapping("/texto")
    public String getTexto() {
        return "texto";
    }
}
