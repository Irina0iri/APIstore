package com.API01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @RequestMapping("/store")
    static String availableProducts() {

        return "hello";
    }

}
