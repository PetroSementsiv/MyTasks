package com.Task;

import java.util.Scanner;

public class Task3 {
int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
        System.out.print("¬вед≥ть число:");
        String chyslo=scaner.nextLine();
      
    						System.out.println(rishennia(chyslo));
    					}
       
	public static int rishennia(String chyslo) {
		int chyslo1=Integer.parseInt(chyslo);
		    int sum = 1;
		    for (int i = 0; i<chyslo.length(); i++) {
		    	int sum1=Integer.parseInt(chyslo.substring(i, i+1));
		        sum = sum * sum1;   
		    }
		    return sum;
		    
		}
					
		
	}
	




	


