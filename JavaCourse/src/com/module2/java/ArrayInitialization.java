package com.module2.java;

public class ArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {98,65,85,47,54};
		System.out.println("no.of subjects"+marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("marks for suject-"+(i+1)+" ="+marks[i]);
		}
		
		/* array iteration using extended for loop */
		for(int mark:marks)
		{
			System.out.println(mark+"|");
		}
System.out.println(marks[6]);// array index out of bound exception
	}

}
