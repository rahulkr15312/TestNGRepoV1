package com.ParallelTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class1 {
	
//	@BeforeClass
//	void beforClass() {
//		System.out.println("Class1=>Method1=> beforeClass " );	
//	}
//	@AfterClass
//	void afterClass() {
//		System.out.println("Class1=>Method1=> afterClass " );	
//	}
	
	
	@Parameters({"username","password"})
	@Test
	void m1( String pass, String user) {
		//System.out.println(user+ " "+pass);
		
		System.out.println("Class1=>Method1 "+Thread.currentThread().getId());
	}
@Test
	
	void m2() {
		System.out.println("Class1=>Method2 "+Thread.currentThread().getId());
	}
@Test

void m3() {
	System.out.println("Class1=>Method3 "+Thread.currentThread().getId());
}
@Test

void m4() {
	System.out.println("Class1=>Method4 "+Thread.currentThread().getId());
}
}
