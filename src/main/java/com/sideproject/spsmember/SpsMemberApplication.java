package com.sideproject.spsmember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpsMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsMemberApplication.class, args);
	}
	@GetMapping("/member/info")
    public String info(@Value("${server.port}") String port) {
        return "this is member";
    }
}
