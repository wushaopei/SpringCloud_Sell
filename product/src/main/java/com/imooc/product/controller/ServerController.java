package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ServerController
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 16:31
 * @Version 1.0
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product msg ";
    }
}
