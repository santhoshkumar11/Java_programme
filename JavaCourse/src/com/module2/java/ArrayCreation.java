package com.module2.java;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks =new int[7];
		marks[0] = 98;
		marks[1] = 70;
		
		System.out.println("size of array is"+marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Mark of student is"+marks[i]+"\t");
		}
		
		boolean[] status = new boolean[5];
				for(boolean stat:status)
				{
					System.out.println(stat+"\t");
				}
				
		String[] names = new String[10];
				for (String name:names)
				{
					System.out.println(name+"\t");
				}
				
		int [] n = new int[] {25,87,85,84,75};
		for(int num:n)
		{
			System.out.println(num);
		}

	}

}
