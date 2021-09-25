package com.assignment.java;

import java.util.Scanner;

public class addDigits {
// first file
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digits, sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		while(num>0)
		{
		//get the last digit of a number
		digits=num%10;
		
		//sum of all digits of a number
		
		sum= sum+digits;
		
		//remove the last digit of a number
		num = num/10;
		
		//prints the result
		
		}
		System.out.println("Sum of digits: "+sum);
	}

}
