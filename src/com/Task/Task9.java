package com.Task;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO ������ ��� ������ ������  � ������� �� �������
		// ������ ��� �������� � �������� ����
		StringBuilder output = new StringBuilder();
		Scanner scaner = new Scanner(System.in);
		System.out.print("������ ������ 1-�� ������:");
		int firstArrayRows = scaner.nextInt();
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ������ 1 -�� ������:");
		int firstArrayColumns = scanner.nextInt();
		int Array[][] = new int[firstArrayRows][firstArrayColumns];
		for (int i = 0; i < firstArrayRows; i++) {
			for (int j = 0; j < firstArrayColumns; j++) {
				System.out.print("����� ����� " + (j + 1) + ": ");
				Array[i][j] = scanner.nextInt();
				output.append(" ").append(Array[i][j]);
			}

			output.append("\n");
			System.out.println("\n");
		}
		StringBuilder masyv2 = new StringBuilder();
		Scanner vv2 = new Scanner(System.in);
		System.out.print("������ ������ 2-�� ������:");
		int secondArrayRows = vv2.nextInt();
		Scanner vvid = new Scanner(System.in);
		System.out.print("������ ������ 2 -�� ������:");
		int secondArrayColums = vvid.nextInt();
		int ArrayDwa[][] = new int[secondArrayRows][secondArrayColums];
		for (int i = 0; i < secondArrayRows; i++) {
			for (int j = 0; j < secondArrayColums; j++) {
				System.out.print("����� ����� " + (j + 1) + ": ");
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
			
	    System.out.println("������� ������ ����:");
	    System.out.println();
		} else { 
			System.out.println("����������� ������ ������");
		}
		System.out.println("��� 1 ����� ������ ������:");
		System.out.println(output);
		System.out.println("��� 2 ����� ������ ������:");
		System.out.println(masyv2);
        System.out.println("�������� ������:");
        System.out.println(rezult);
	}
}
