package com.damian34.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationContextTest {

	@Test
	void springContextTest() {
		// test context only
		Assertions.assertTrue(true);
	}

}
