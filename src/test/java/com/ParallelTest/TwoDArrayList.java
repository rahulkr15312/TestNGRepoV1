package com.ParallelTest;

import java.util.*;

public class TwoDArrayList {

	public static void main(String[] args) {
		
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		list.add(new ArrayList<Integer>());
		
		list.get(0).add(0,1);
		list.get(0).add(0,1);
		
		list.add(new ArrayList<Integer>(Arrays.asList(1,5,7,9)));
		
		System.out.println(list);

	}

}
