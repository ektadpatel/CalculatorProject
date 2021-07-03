package com.miit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Functions f = new Functions();

	@Test
	public void testAdd() {

		double add = f.add(5, 5);
		assertEquals(11, add, 0);

	}

	@Test
	public void testSub() {

		double sub = f.sub(5, 5);
		assertEquals(0, sub,0);
	}

	@Test
	public void testMulti() {

		double multi = f.multi(5, 5);
		assertEquals(25, multi);
	}

	@Test
	public void testDiv() {

		double div = f.div(5, 5);
		assertEquals(1, div,0);
	}

	@Test
	public void testMod() {

		// Functions f = new Functions();
		double mod = f.mod(5, 5);
		assertEquals(0, mod,0);
	}

}
