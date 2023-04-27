package com.ParallelTest;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	
	void m5() {
		System.out.println("Class2=>Method5 "+Thread.currentThread().getId());
	}
@Test
	
	void m6() {
		System.out.println("Class2=>Method6 "+Thread.currentThread().getId());
	}
@Test

void m7() {
	System.out.println("Class2=>Method7 "+Thread.currentThread().getId());
}

}
