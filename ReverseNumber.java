package com.blz.assignment.day2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get reverse");
		int num = sc.nextInt();
		int  reverse = 0;  
		while(num != 0)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the Entered number is: " + reverse);
	}
}
