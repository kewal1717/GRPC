package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		//Coach theCoach = new TrackCoach();
		
		// use the object
	//	System.out.println(theCoach.getDailyWorkout());
		
		
		//find sum of n number
		
		long Time = System.currentTimeMillis();
		
		
		MyApp myApp = new MyApp();
		
		System.out.println(myApp.FindSum(99999999));
		
		System.out.println("Time taken : - " + (System.currentTimeMillis()-Time) + " millisec");
		
	}

	/*
	 * private int FindSum(int n) {
	 * 
	 * return n * (n+1)/2; }
	 */

	public int FindSum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		return sum;
	}
}
