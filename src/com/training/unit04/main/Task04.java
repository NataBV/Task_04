package com.training.unit04.main;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/* Задан массив. Вычислить суммы трех последовательно
		 расположенных элементов */
		
		int n = 10;
		int[] mas = new int[n];
		Scanner sc = new Scanner(System.in);
		
		//заполнение массива
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int)(Math.random()*200);
			System.out.print("[" + mas[i]+ "] ");
			if (mas[i]%2 ==0) {
				j++;
			}
		}
		System.out.println();
		
		int i;
		System.out.print("введите значение от 0 до " + (n-3) + ": ");
		i = sc.nextInt();
		if (i > (n-3)) {
			System.out.println("Некорректный ввод данных");
			return;
		} 
		
		int sum = calcSum(i, mas);
		System.out.println("Сумма трех эл-ов от " + (i+1) + "го = " + sum);
		

	}
	
	// подсчет суммы трех элементов массива
	public static int calcSum(int i, int mass[]) {
		int sum = 0;
		for (int j = i; j <=  (i+1); j++) {
			sum = sum + mass[j];
		}
		
		return sum;
	}

}
