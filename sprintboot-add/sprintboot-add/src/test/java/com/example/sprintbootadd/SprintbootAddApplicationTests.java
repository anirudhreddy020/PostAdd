package com.example.sprintbootadd;

import com.example.utility.AdditionUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AdditionControllerTest {

	@Test
	public void testAddition() {
		int a = 5;
		int b = 7;
		int expected = 12;

		int result = AdditionUtility.add(a, b);
		//Assertions.assertEquals(expected, result);
	}
}
