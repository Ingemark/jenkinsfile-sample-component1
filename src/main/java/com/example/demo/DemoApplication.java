package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
            SpringApplication.run(DemoApplication.class, args);
	}

    public static String f1(String p1) {
        return p1 + "A";
    }

}
