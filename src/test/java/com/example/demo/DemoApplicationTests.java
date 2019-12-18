package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void f1test() {
        DemoApplication.f1("0");
        System.out.println("H");
        System.out.println("H");
    }
}
