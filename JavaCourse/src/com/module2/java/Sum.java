package com.module2.java;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:  ");
		int n1=  sc.nextInt();
		System.out.println("enter the second number: ");
		int n2 = sc.nextInt();
		
		int n= n1+n2;
		System.out.println(n1+"+"+n2+"="+n);
		sc.close();
	}

}
