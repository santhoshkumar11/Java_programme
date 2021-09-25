package com.assignment.java;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int n = sc.nextInt();
		
		if (n>=18)
		{
			System.out.println("You are elegible for vote");
		}
		else
		{
			System.out.println("You are not elgible for vote");
		}
	}

}
