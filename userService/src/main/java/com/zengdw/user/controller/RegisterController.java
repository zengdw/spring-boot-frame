package com.zengdw.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengd
 * @version 1.0
 * @date 2023/4/27 10:54
 */
@RestController
@RequestMapping
public class RegisterController {
    @PostMapping("/send")
    public String sendMessage(String message) {
        return "Message sent: " + message;
    }
}
