package com.assignment.java;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n, n1, b=0;
                 n = scn.nextInt();
                 n1 = scn.nextInt();
                
                 if(n>n1)
                 {
                	 b= n;
                 }
                 else if(n1>n)
                 {
                	 b=n1;
                 }
      
                System.out.println(b);
	}

}
