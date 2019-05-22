package com.ujiPengetahuan;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

import org.junit.jupiter.api.Test;

class mainClassTest {

	@Test
	public void test_main()
	{
		System.out.println("main");
		String[] args = null;
		final InputStream original = System.in;
		Application.main(args);
		System.setIn(original);
	}

}
