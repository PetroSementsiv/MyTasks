package com.Task;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// створити одновим≥рний масив ≥ в≥дсортувати числа у ньому по зростанню та
		// вивести числа €к≥ д≥л€тьс€ на 2 3 5 ≥ решту у р≥зних р€дка двовим≥рного масиву
		int countl = 0;
		int countm = 0;
		int countg = 0;
		int countv = 0;
		Scanner scaner = new Scanner(System.in);
		System.out.print("¬вед≥ть к≥льк≥сть елемент≥в масиву:");
		int inputNumbers = scaner.nextInt();
		int[] enteredArray = new int[inputNumbers];
		for (int i = 0; i < enteredArray.length; i++) {
			System.out.println("¬вед≥ть " + (i + 1) + " " + "елемент:");
			enteredArray[i] = scaner.nextInt();
			if (enteredArray[i] % 2 == 0) {
				countl++;
			}
			if (enteredArray[i] % 3 == 0) {
				countm++;
			}
			if (enteredArray[i] % 5 == 0) {
				countg++;
			}
			if (enteredArray[i] % 2 != 0 && enteredArray[i] % 3 != 0 && enteredArray[i] % 5 != 0) {
				countv++;

			}

		}

		System.out.println("¬аш  введений масив:" + " ");
		printArray(enteredArray);
		System.out.println(
				"2 divide elements" + countl + "3 divide" + countm + "5 divide" + countg + "no divide" + countv);
		bubleSort(enteredArray);
		System.out.println("¬аш в≥дсортований масив:" + " ");
		printArray(enteredArray);
		twoDimArray(enteredArray, countl, countm, countg, countv);
	}

	public static void bubleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int arrange = array[i];
					array[i] = array[j];
					array[j] = arrange;
				}
			}
		}
	}

	public static void twoDimArray(int[] arraySorted, int countl, int countm, int countg, int countv) {
		int twoDimArray[][] = new int[4][];
		twoDimArray[0] = new int[countl];
		twoDimArray[1] = new int[countm];
		twoDimArray[2] = new int[countg];
		twoDimArray[3] = new int[countv];
		int l = 0, m = 0, g = 0, v = 0;
		for (int i = 0; i < arraySorted.length; i++) {
			if (arraySorted[i] % 2 == 0) {
				twoDimArray[0][l] = arraySorted[i];
				l++;
			}
			if (arraySorted[i] % 3 == 0) {
				twoDimArray[1][m] = arraySorted[i];
				m++;
			}
			if (arraySorted[i] % 5 == 0) {
				twoDimArray[2][g] = arraySorted[i];
				g++;
			}
			if (arraySorted[i] % 2 != 0 && arraySorted[i] % 3 != 0 && arraySorted[i] % 5 != 0) {
				twoDimArray[3][v] = arraySorted[i];
				v++;
			}

		}
		System.out.println("Two dimentsional array+");
		printTwoArray(twoDimArray);
	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	
	}
	public static void printTwoArray(int[][] twoDimArray) {
		for (int i=0; i < twoDimArray.length; i++) {
			for(int j=0; j<twoDimArray[i].length; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
