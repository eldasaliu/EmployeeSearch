package com.neotech.lesson04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {

	@Test
	public void test1() {
		System.out.println("This is test1 method");
		// making sure this test passes
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("This is test2 method");
		// making sure this test fails
		Assert.assertTrue(false);
	}

}

// onStart(one time)

// onTestStart()
// test1()
// onTestSuccess()

// onTestStart()
// test2()
// onTestFailed()

// onFinish(one time)


