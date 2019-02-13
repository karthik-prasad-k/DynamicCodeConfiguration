package com.config.configclient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class ConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}

