package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// Ввести дані помасиву і отримати його
	    StringBuilder output = new StringBuilder();

		Scanner scaner = new Scanner(System.in);
		System.out.print("Введіть висоту масиву:");
		int m = scaner.nextInt();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть ширину масиву:");
		int k = scanner.nextInt();
		int Array[][] = new int[m][k];
		 for (int i = 0; i < m; i++) {
		 for (int j = 0; j < k; j++) { 	
			 System.out.print("Ведіть число " + (j + 1) + ": ");
	            Array[i][j] = scanner.nextInt();
	            output.append(" ").append(Array[i][j]);
	        }
	        output.append("\n");
	        System.out.println("\n");

	    }

	    System.out.println("Ваш масив матиме вигляд:");
	    System.out.println(output);   
		 }
		
		}
	