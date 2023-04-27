package com.ParallelTest;

import org.testng.annotations.Test;

public class Class4 {
	
	@Test
	
	void m1() {
		System.out.println("Class4=>Method1 "+Thread.currentThread().getId());
	}
@Test
	
	void m2() {
		System.out.println("Class4=>Method2 "+Thread.currentThread().getId());
	}
@Test

void m3() {
	System.out.println("Class4=>Method3 "+Thread.currentThread().getId());
}
@Test

void m4() {
	System.out.println("Class4=>Method4 "+Thread.currentThread().getId());
}
}
