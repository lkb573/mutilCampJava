package com.multicampus.biz.junit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.multicampus.biz.junit.MyCalc;

public class MyCalcTest {
	private MyCalc calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("===> globalSetUp()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("===> globalTearDown()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("---> setUp()");
		calc = new MyCalc(10, 3);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("---> tearDown()");
		calc = null;
	}

	@Test
	public void testPlus() {
		System.out.println("===> testPlus() 호출");
		assertEquals(13, calc.plus());
	}

	@Test
	public void testMinus() {
		System.out.println("===> testMinus() 호출");
		assertEquals(7, calc.minus());
	}

}
