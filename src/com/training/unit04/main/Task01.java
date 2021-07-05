package com.training.unit04.main;

public class Task01 {

	public static void main(String[] args) {
		// найти методы по нахождению НОД и НОК
		
		int a, b, x, y;
		
		a=25; // (int)(Math.random()*200);
		b=30; // (int)(Math.random()*200);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
		x = findNod(a, b);
		System.out.println("NOD=" + x);
		y = findNok(a, b, x);
		System.out.println("NOK=" + y);

	}
	
	// нахождение НОД
	public static int findNod (int a, int b) {
		int i;
		if (a > b) { 
			i = b;
		} else {
			i = a;
		}
		
		while (!(((a%i)== 0) & ((b%i) == 0))) {
			i = i-1;
		}
		return i;
	}
	
	// нахождение НОК
	public static int findNok (int a, int b, int c) {
		int i;
		i = (a * b) / c;
		return i;
	}
}
