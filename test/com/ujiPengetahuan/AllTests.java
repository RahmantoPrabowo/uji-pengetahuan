package com.ujiPengetahuan;

import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ujiPengetahuan.Application;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	
	
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
