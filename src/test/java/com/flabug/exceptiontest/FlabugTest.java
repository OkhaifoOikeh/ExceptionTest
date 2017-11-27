package com.flabug.exceptiontest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlabugTest {

	@Test
	public void FlakyExceptionTest() {
		String a = "hello";
		String b = a;
		b= (b == a) ? null:"hi";
		System.out.println(b.toString());
	}

}
