package org.example.controller;

import com.google.gson.Gson;
import org.example.dtos.SSOGetTokenResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("getUser")
    public String getUser() {
        new Gson().fromJson("{\"access_token\": \"apple\"}", SSOGetTokenResponse.class);
        return "Hello World";
    }
}
