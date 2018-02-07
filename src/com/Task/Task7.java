package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// ������ ������ 1����� ���� ����� � ����� �� ����� � �������� �������� �� ���� �� �����1
		Integer closestSmaller = null;
		Integer closestBigger = null;
		Scanner scaner = new Scanner(System.in);
		System.out.print("������ ����� ��� ��������� ��������:");
		int target = scaner.nextInt();
		List<Integer> list = new ArrayList<>();
		while (closestSmaller == null || closestBigger == null) {
			System.out.print("������ �����:");
			int input = scaner.nextInt();
			if (input < target) {
				if (closestSmaller == null || input > closestSmaller) {
					closestSmaller = input;
				}
			}
            if (input>target) {
            	if (closestBigger == null || input < closestBigger) {
					closestBigger = input;
				}
            }
			list.add(input);
			System.out.println("You entered: " + list);
		}
		System.out.println("��������� ����� � ����� �����  " +  closestSmaller  +"  "+  closestBigger );
	}
}
