package com.training.unit04.main;

public class Task02 {

	public static void main(String[] args) {
		// написать метод для нахождения суммы большего и меньшего из трех чисел
		
		int a, b, c;
		
		a= (int)(Math.random()*200);
		b= (int)(Math.random()*200);
		c= (int)(Math.random()*200);
		
		System.out.println(a + " " + b + " " + c);
		
		long sum = findSum(a, b, c);
		System.out.println("сумма большего и меньшего чисел:" + sum);

	}
	
	// ссумирование
	public static long findSum(int i, int j, int k) {
		long sum;
		sum = findMax(i, j, k) + findMin(i, j, k);
		
		return(sum);
	}
	
	// поиск наибольшего
	public static int findMax(int i, int j, int k) {
		
	if ((i > j) & (i > k)) {return (i);}
	if ((j > i) & (j > k)) {return (j);}
	if ((k > i) & (k > j)) {return (k);}
	return(0);
	
	}
	
	// поиск наименьшего
	public static int findMin(int i, int j, int k) {
		
	if ((i < j) & (i < k)) { return (i);}
	if ((j < i) & (j < k)) { return (j);}
	if ((k < i) & (k < j)) { return (k);}
	return(0);
	
	}
}
