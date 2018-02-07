package com.Task;

import java.util.Scanner;

public class Task12 {
	public static void main(String args[]) throws Exception {
		//показати кількість ел які діляться на 2 3 5 і решту у одновимірному масиві
				Scanner scaner  = new Scanner(System.in);
		int countl = 0;
		int countm = 0;
		int countg = 0;
		int countv = 0;
		int a[] = new int[5], c = 0, i, d, j;
			System.out.println("Enter number:");
			
		for (i = 0; i < 5; i++)
			a[i] = scaner.nextInt();
		for (i = 0; i < 5; i++) {
			if(a[i] %2 ==0) { 
				countl++;
			}
			if(a[i] % 3 ==0) {
				countm++;
			}
		    if(a[i] % 5 ==0) {
		    	countg++;
		    }
		   	if(a[i]%2!=0 && a[i]%3!=0 && a[i]%5!=0) {
		   		countv++;
		   	}
		}
		System.out.println("divide2 on" + countl);
		System.out.println("three" + countm);
		System.out.println("five" +countg);
		System.out.println("no divide" + countv);
		
	}
	
}
