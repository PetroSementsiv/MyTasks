package com.Task;

import java.util.Scanner;

public class Task5 {
	int i = 0;

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введіть число:");
        int chyslo=1;
		int sum = 0;
		int dob = 1;
		while (chyslo != 0) {
			chyslo = scaner.nextInt();
			System.out.print("Введіть число:");
			if (chyslo % 3 == 0) {
				sum = sum + chyslo;
			}
			if (chyslo % 2==0 && chyslo!=0) {
				dob = dob*chyslo;
			}
		}
		System.out.println("Сума чисел, які діляться на три:"+ sum);
		System.out.println("Добуток чисел, які діляться на 2:"+ dob);
	}
}