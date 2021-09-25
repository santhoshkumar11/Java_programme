package com.module2.java;

public class NaturalNumbers {
	
	static void printNatural()
	{
		int n=1;
		while(n<11)
		{
			
			System.out.println(n);
			n=n+1;
		}
		
	}
	
	static void printNaturals1()
	{
		for(int n=1;n<=10;n++)
		{
			if(n==10)
			System.out.println(n+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First 10 natural number");
//printNatural();
printNaturals1();
	}

}
