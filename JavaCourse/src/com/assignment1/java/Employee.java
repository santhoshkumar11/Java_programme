package com.assignment1.java;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] empNums = new int[5];
		String[] empName = new String[5];
		double[] empSal = new double[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("entert the employee number");
			empNums[i] = sc.nextInt();
			System.out.println("Enter the employee name");
			sc.nextLine(); 
			empName[i] = sc.nextLine();
			System.out.println("Please enter your salary");
			empSal[i]=sc.nextDouble();
			
			
			
		}
		display(empNums,empName,empSal);
		display(empNums, empName);
	}
	
	static void display(int nums[],String name[], double salar[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(nums[i]+"   "+name[i]+"   "+salar[i]);
		}
	}


	static void display(int nums[],String name[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(nums[i]+"   "+name[i]);
		}
	}

}
