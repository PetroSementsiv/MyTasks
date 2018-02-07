package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// �������� ����������� ����� � ����������� ����� � ����� �� ��������� �� �������
		Scanner scaner = new Scanner(System.in);
		System.out.print("������ ������� �������� ������:");
		int inputNumbers = scaner.nextInt();
		int[] enteredArray = new int[inputNumbers];
		for (int i = 0; i < enteredArray.length; i++) {
			System.out.println("������ " + (i + 1) + " " + "�������:");
			enteredArray[i] = scaner.nextInt();
		}

		System.out.println("���  �������� �����:"+ " ");
		printArray(enteredArray);
		bubleSort(enteredArray);
		System.out.println("��� ������������ �����:"+ " ");
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
