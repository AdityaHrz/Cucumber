package com.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksEx1 {

	@Before("@T1")
	public void before() {
		System.out.println("this is from the external hooks file : @Before");
	}
	@After("T1")
	public void after() {
		System.out.println("this is from the external hooks file : @After");
	}
}