package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
        @SuppressWarnings("squid:S2699")
	void contextLoads() {
	}

    @Test
    @SuppressWarnings("squid:S2699")
    void f1test() {
        DemoApplication.f1("0");
    }
}
