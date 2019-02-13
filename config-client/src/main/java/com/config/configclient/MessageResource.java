package com.config.configclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@RestController
@RequestMapping("/rest")
//@Configuration
@PropertySource("file:C:/Users/kkalasa/Downloads/config-server-properties/config-client.properties")
public class MessageResource {
	public int a,b;
	
	@Value("#{${message:Default 0}}")
	private String message;
	
	
	@GetMapping("/message")
	public String message() {		
		return message;
	}
	
}
