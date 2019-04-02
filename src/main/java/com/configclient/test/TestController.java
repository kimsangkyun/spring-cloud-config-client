package com.configclient.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @GetMapping(name = "/test")
    public HashMap<String, Object> getTest() {
        return testService.getTest();
    }
}
