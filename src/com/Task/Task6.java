package com.Task;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.print("������ �����:");
        int chyslo=1;
		int sum = 0;
		int dob = 1;
		while (chyslo != 0) {
			chyslo = scaner.nextInt();
			System.out.print("������ �����:");
			if (chyslo % 3 == 0) {
				sum = sum + chyslo;
			}
			else {
				dob = dob*chyslo;
			}
		}
		System.out.println("���� �����, �� ������� �� ���:"+ sum);
		System.out.println("������� �����, �� ������� �� 2:"+ dob);
	}
}
	


