package com.blz.assignment.day2;

import java.util.Scanner;

public class PrintValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ranging from 0-1000 to check the Units,Tens,Thousand & Ten Thousands Value");
		int num = sc.nextInt();
		int thousand = 0;
		int hundred = 0;
		int tens = 0;
		int unit = 0;
		if (num >= 1 && num <= 999) {
			hundred = (num / 100) % 10;
			System.out.println("Hundreds place digit: " + hundred);
			tens = (num / 10) % 10;
			System.out.println("Tens place digit: " + tens);
			unit = (num % 10);
			System.out.printf("Ones place digit: " + unit);
		} else {
			if (num == 1000)
			thousand = num / 1000;
		    System.out.println("thousands place digit: " + thousand);
			hundred = (num / 100) % 10;
			System.out.println("Hundreds place digit: " + hundred);
			tens = (num / 10) % 10;
			System.out.println("Tens place digit: " + tens);
			unit = (num % 10);
			System.out.printf("Ones place digit: " + unit);
		}

	}

}
