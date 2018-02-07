package com.Task;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO ввести два довільні масиви  і вивести їх добуток
		// Ввести дані помасиву і отримати його
		StringBuilder output = new StringBuilder();
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введіть висоту 1-го масиву:");
		int firstArrayRows = scaner.nextInt();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть ширину 1 -го масиву:");
		int firstArrayColumns = scanner.nextInt();
		int Array[][] = new int[firstArrayRows][firstArrayColumns];
		for (int i = 0; i < firstArrayRows; i++) {
			for (int j = 0; j < firstArrayColumns; j++) {
				System.out.print("Ведіть число " + (j + 1) + ": ");
				Array[i][j] = scanner.nextInt();
				output.append(" ").append(Array[i][j]);
			}

			output.append("\n");
			System.out.println("\n");
		}
		StringBuilder masyv2 = new StringBuilder();
		Scanner vv2 = new Scanner(System.in);
		System.out.print("Введіть висоту 2-го масиву:");
		int secondArrayRows = vv2.nextInt();
		Scanner vvid = new Scanner(System.in);
		System.out.print("Введіть ширину 2 -го масиву:");
		int secondArrayColums = vvid.nextInt();
		int ArrayDwa[][] = new int[secondArrayRows][secondArrayColums];
		for (int i = 0; i < secondArrayRows; i++) {
			for (int j = 0; j < secondArrayColums; j++) {
				System.out.print("Ведіть число " + (j + 1) + ": ");
				ArrayDwa[i][j] = vvid.nextInt();
				masyv2.append(" ").append(ArrayDwa[i][j]);
			}
			
			masyv2.append("\n");
			System.out.println("\n");
		}
		
		StringBuilder rezult = new StringBuilder();	
		if (firstArrayColumns == secondArrayRows ) {
			int[][] outputArray = new int[firstArrayRows][secondArrayColums];
			for (int i = 0; i <firstArrayRows ; i++) {
				for (int j = 0; j < secondArrayColums; j++) {
					outputArray[i][j]=0;
					for (int k = 0; k <firstArrayColumns ; k++) {
						outputArray[i][j]=outputArray[i][j]+ Array[i][k]*ArrayDwa[k][j];
						
			        }
					rezult.append(" ").append(outputArray[i][j]);
				}
				rezult.append("\n");
		    }
			
	    System.out.println("Добуток масивів буде:");
	    System.out.println();
		} else { 
			System.out.println("Неправильно введені масиви");
		}
		System.out.println("Ваш 1 масив матиме вигляд:");
		System.out.println(output);
		System.out.println("Ваш 2 масив матиме вигляд:");
		System.out.println(masyv2);
        System.out.println("помножені масиви:");
        System.out.println(rezult);
	}
}
