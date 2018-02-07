package com.Task;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Task2 {

	public static void main(int args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("¬вед≥ть  чотирьохзначне число:");
int chyslo=input.nextInt();// Tipe mismatch:cannot convert from String to int;
if (chyslo<1000) {
	System.out.println("„исло введено не правильно.¬вед≥ть чотирьохзначне число!");
	System.exit(0);
} else {
	System.out.println(rishennia(chyslo));
}
	}
public static int rishennia(int chyslo) {
	int chyslo1= chyslo/1000;
	int chyslo2= chyslo/100-chyslo1*10;
	int chyslo3= chyslo/10-chyslo2*100;
	int chyslo4= chyslo-chyslo3*1000;
	return chyslo1*chyslo2*chyslo3*chyslo4;
}
}
