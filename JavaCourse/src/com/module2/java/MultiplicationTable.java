package com.module2.java;

import java.util.Scanner;

public class MultiplicationTable {
	
	static void printTable(int num)
	{
		for(int i=0; i<=10;i++)
		{
			int p = num * i;
			System.out.println(num+ "x"+i+"="+p);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number multiplication table?");
		int n= sc.nextInt();
		printTable(n);
		sc.close();
		
		
	}

}
