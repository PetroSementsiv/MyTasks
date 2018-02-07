package com.Task;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
        System.out.print("¬вед≥ть число:");
        String chyslo=scaner.nextLine();
        if (chyslo.length()!=4) {
        	System.out.println("„исло введено не правильно. ¬вед≥ть4-х розр€дне число");  				
        	System.exit(0);	
      
        } else {
    						System.out.println(rishennia(chyslo));
    					}
       
    }
	public static int rishennia(String chyslo) {
		int chyslo1= Integer.parseInt(chyslo.substring(0, 1));
		int chyslo2= Integer.parseInt(chyslo.substring(1, 2));
		int chyslo3= Integer.parseInt(chyslo.substring(2, 3));
		int chyslo4= Integer.parseInt(chyslo.substring(3, 4));
		return chyslo1*chyslo2*chyslo3*chyslo4;
	}
	
}


