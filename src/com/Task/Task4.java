package com.Task;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rozriadnist = new Scanner(System.in);
        System.out.print("������ ���������� �����:");
        String rozriadChysla=rozriadnist.nextLine();
	    Scanner scaner = new Scanner(System.in);
	    int rozriadChysla1=Integer.parseInt(rozriadChysla);
	    System.out.print("������ ����� �� ����������:"+ rozriadChysla);
        String chyslo=scaner.nextLine();
        if (chyslo.length()!=rozriadChysla1) {
      System.out.println("����� ������� �����������!");
        } else {
      System.out.println(rishennia(chyslo));
    					}
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
	


	


