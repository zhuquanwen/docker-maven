package com.zqw.docker.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2018/8/1 15:46
 * @since jdk1.8
 */
@SpringBootApplication
@RestController
public class DockerMavenApp {
    public static void main(String[] args) {
        SpringApplication.run(DockerMavenApp.class, args);
    }
    @GetMapping("/test")
    public String test(){
        return UUID.randomUUID().toString();
    }
}
