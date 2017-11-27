package com.flabug.exceptiontest;

import static org.junit.Assert.assertEquals;

import com.mycompany.app.Objects;

import org.junit.Test;

public class FlabugTest {

	@Test
	public void FlakyExceptionTest() {
		String a = "hello";
		String b = a;
		b= (b == a) ? null:"hi";
		System.out.println(b.toString());
	}
	
	@Test
	public void FactoryTest(){
		String obj = Objects.Factory();
		String obj2 =  Objects.Factory();

	    assertEquals(obj, obj2);
	}


}
