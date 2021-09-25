
package com.module2.java;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  =new Scanner(System.in);
		
		System.out.println("enter students name: ");
		String name   = sc.nextLine();
		
		System.out.println("enter number of subjects: ");
		int no = sc.nextInt();
		
		/* create an array to store no subject marks*/
		int[] marks = new int[no];

		for(int i=0; i<marks.length; i++)
		{
			System.out.println("enter marks for subjects"+(i+1)+": ");
			marks[i]= sc.nextInt();
		}
		
		System.out.println("--------------------------------");
		System.out.println("\t\tReport Card");
		System.out.println("--------------------------------");
		System.out.println("Name"+name);
		System.out.println("--------------------------------");
		System.out.println(" Subject \t\t Marks");
		System.out.println("--------------------------------");

		int total =0;
		for(int i=0;i<marks.length;i++)
		{
			total =total+marks[i];
			System.out.println("Subject-"+(i+1)+"\t\t "+marks[i]);
		}
		System.out.println("--------------------------------");
		float avg = ((float)total)/no;
		System.out.println(total);
	}

}
