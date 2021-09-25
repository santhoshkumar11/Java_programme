package com.module3.java;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Santhosh";
		String s2= "Santhosh";
		
		System.out.println(s1==s2);
		
		String s3= new String("java");
		String s4 =new String("Java");
		
		//double equal to check the elements on memory
		
		//both are pointing to different memory so only false
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
	}

}
