package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// створити одновим≥рний масив ≥ в≥дсортувати числа у ньому по зростанню та вивести
		Scanner scaner = new Scanner(System.in);
		System.out.print("¬вед≥ть к≥льк≥сть елемент≥в масиву:");
		int inputNumbers = scaner.nextInt();
		int[] enteredArray = new int[inputNumbers];
		for (int i = 0; i < enteredArray.length; i++) {
			System.out.println("¬вед≥ть " + (i + 1) + " " + "елемент:");
			enteredArray[i] = scaner.nextInt();
		}

		System.out.println("¬аш  введений масив:"+ " ");
		printArray(enteredArray);
		bubleSort(enteredArray);
		System.out.println("¬аш в≥дсортований масив:"+ " ");
		printArray(enteredArray);
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

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

}
