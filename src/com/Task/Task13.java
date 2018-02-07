package com.Task;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// Створити і вивести троьох вимірний масив
		Scanner scaner = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int inputRows = scaner.nextInt();
		System.out.print("Enter number of columns:");
		int inputColumns = scaner.nextInt();
		System.out.print("Enter depth of the array:");
		int inputDepth = scaner.nextInt();
		int array[][][] = new int[inputRows][inputColumns][inputDepth];
		for (int i = 0; i < inputRows; i++) {
			for (int j = 0; j < inputColumns; j++) {
				for (int d = 0; d < inputDepth; d++) {
					System.out.print("Enter the number:" + (d + 1) + ":");
					array[i][j][d] = scaner.nextInt();
				}
			}
		}
		for (int i = 0; i < inputRows; i++) {
			for (int j = 0; j < inputColumns; j++) {
				for (int d = 0; d < inputDepth; d++) {
					System.out.println(" array[ " + i + "] + [" + j + "] + [" + d + "] = " + array[i][j][d] + "\t");
				}
			}
		}
	}
}