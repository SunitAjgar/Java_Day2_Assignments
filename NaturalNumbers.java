package com.blz.assignment.day2;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		int num = 0;
		int i = 1;
		int sum = 0;  
		Scanner sc = new Scanner(System.in);   
		System.out.print("Enter the Natural Number: ");  
		num = sc.nextInt();  
		while(i <= num)  
		{  
		sum = sum + i;    
		i++;  
		} 
		System.out.println("Sum of Natural Number = " + sum); 
	}
}
