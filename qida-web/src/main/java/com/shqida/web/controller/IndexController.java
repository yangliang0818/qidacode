package com.shqida.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangliang on 2017/6/4.
 */
@RestController
public class IndexController {
    @GetMapping(value = "/index")
    public String index() {
        return "hello spring boot";
    }
}
