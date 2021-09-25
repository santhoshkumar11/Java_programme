package com.assignment.java;

import java.util.Scanner;

public class Multiply10 {
	
	static void printTale(int n)
	{
		int i=1;
		while(i <=10)
		{
			
			int p = n * i;
			System.out.println(n+ "x"+i+"="+p);
			
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		printTale(num);
	}

}
