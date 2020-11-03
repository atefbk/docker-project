package com.atef.virtualisation.appdocker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class AppDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDockerApplication.class, args);
    }

    @GetMapping("/test")
    public Map<String, Object> test(){
        Map<String, Object> data = new HashMap<>();
        data.put("roon", "From docker");
        data.put("atef", 1981);
        return data;
    }

    

}
