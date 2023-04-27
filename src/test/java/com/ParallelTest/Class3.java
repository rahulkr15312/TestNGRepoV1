package com.ParallelTest;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test
	
	void m12() {
		System.out.println("Class3=>Method12 "+Thread.currentThread().getId());
	}
@Test
	
	void m13() {
		System.out.println("Class3=>Method13 "+Thread.currentThread().getId());
	}
@Test

void m14() {
	System.out.println("Class3=>Method14 "+Thread.currentThread().getId());
}
@Test

void m15() {
	System.out.println("Class3=>Method15 "+Thread.currentThread().getId());
}
}
