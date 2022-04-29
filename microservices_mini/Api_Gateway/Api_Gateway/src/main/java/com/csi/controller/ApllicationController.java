package com.csi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApllicationController {

    @GetMapping("/userfallback")
    public String userFallback(){

        return " User Service Is Down";
    }
    @GetMapping("/productfallback")
    public String productFallback(){

        return " Product Service Is Down";
    }
    @GetMapping("/departmentfallback")
    public String departmentFallback(){

        return " Department Service Is Down";
    }
}
