package com.config.configserver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@ComponentScan
public class ConfigServerApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(ConfigServerApplication.class, args);
	    SpringApplication.run(ConfigServerApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		String num1;
	   do {
		//  prompt for the user's name
	    System.out.println("Enter 2 numbers: ");

	    // get their input as a String
	    System.out.println("num1: ");
	    num1 = scanner.next();
	    
	    System.out.println("num2: ");
	    String num2 = scanner.next();
	    
	    System.out.println("optr: ");
	    String optr = scanner.next();

	    //System.out.println(num1:);
	    

	    Properties props = new Properties();
	    FileInputStream in = new FileInputStream("C:/Users/kkalasa/Downloads/config-server-properties/config-client.properties");
	    props.load(in);
	    in.close();
	    
	    OutputStream output=null;
		try {
			output = new FileOutputStream("C:/Users/kkalasa/Downloads/config-server-properties/config-client.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    props.setProperty("a", num1);
	    props.setProperty("b", num2);
	    props.setProperty("optr", optr);
	    props.store(output, null);
	    output.close();
	   }while(Integer.parseInt(num1)!=0);
	}
}

