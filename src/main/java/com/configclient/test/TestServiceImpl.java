package com.configclient.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RefreshScope
public class TestServiceImpl {

    @Value("${who.am.kimsangkyun}")
    private String name;

    public HashMap<String, Object> getTest() {
        HashMap<String, Object> resultMap = new HashMap<>();

        resultMap.put("name", name);

        return resultMap;
    }
}
