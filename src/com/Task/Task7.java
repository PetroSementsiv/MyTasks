package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// задача ввести 1число потім більші і менші від нього і показати найблищі ро знач до числа1
		Integer closestSmaller = null;
		Integer closestBigger = null;
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введіть число для здійснення операції:");
		int target = scaner.nextInt();
		List<Integer> list = new ArrayList<>();
		while (closestSmaller == null || closestBigger == null) {
			System.out.print("Введіть число:");
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
		System.out.println("Найближче менше і більше числа  " +  closestSmaller  +"  "+  closestBigger );
	}
}
