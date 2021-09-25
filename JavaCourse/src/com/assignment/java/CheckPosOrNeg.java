package com.assignment.java;

import java.util.Scanner;

public class CheckPosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  ");
		
		int num = sc.nextInt();
		
		if (num<0)
		{
			System.out.println("number is negative");
		}
		else if(num==0)
		{
		 System.out.println("numbr is zero");
		}
		else
		{
			System.out.println("number is positive");
		}
	}

}
