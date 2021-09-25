package com.assignment.java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, fact=1;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		
		System.out.println("Factorial of numer is"+fact);
	}

}
