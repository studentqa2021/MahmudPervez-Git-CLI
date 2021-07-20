package com.testing;

import java.util.Arrays;

public class AnimalClass {
	
	public static void main(String[] args) {
		arraysTest();
	String [] name = new String[5];
	name [0] = "Sayaan";
	name [1] = "Sushmita";
	name [2] = "Mahmud";
	name [3] = "Pervez";
	name [4] = "shoshe";
	
		System.out.println(Arrays.toString(name));
		for (String count: name) {
			System.out.println(count);
		}
	
	}
	public static void arraysTest() {
		
		int [] age = {10,20,30,40,50};
		System.out.println(Arrays.toString(age));
		System.out.println("single value of age: q" +age[2]);
		
		for (int i=0; i<age.length; i++) {
			System.out.println(age[i]);
			
		}
		
	}
	}


