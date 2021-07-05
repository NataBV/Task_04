package com.training.unit04.main;
import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// написать метод,который определяет в каком из данных
		// двух чисел больше цифр
		
		int a, b, c;
		Random rand = new Random();
		
		a = rand.nextInt();
		b = rand.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		c = compare(a,b);
		
		if (c == 1 || c == 2) {
			System.out.println("Цифр больше в " + c + "ом числе");
		} else {
			System.out.println("Одинаковое количество цифр в числах");
		}
	}
		
	// сравнение длинн чисел
	public static int compare(int x, int y) {	
		int k = 0;
		
		if (counting(x) > counting(y)) {
			k = 1;
		}else if (counting(x) < counting(y)) {
			k = 2;
		}
		return (k);
	}
	
	// подсчет количества цифр
	public static int counting(int i) {
		int count = 0;
	
		while (i != 0) {
			i = i/10;
			count++;
		}
		return(count);
	}

}
