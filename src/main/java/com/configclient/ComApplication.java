package com.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* config server에서
* -Dspring.profiles.active=prod에서 값 prod에 해당하는 환경설정 파일을 가져옴
*
* */
@SpringBootApplication(scanBasePackages = "com.configclient")
public class ComApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ComApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
