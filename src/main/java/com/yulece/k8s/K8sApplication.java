package com.yulece.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/k8s")
@RestController
public class K8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
    }
    @RequestMapping
    public ResponseEntity getK8s(@RequestParam("username") String username){
        return ResponseEntity.ok(username);
    }
}
