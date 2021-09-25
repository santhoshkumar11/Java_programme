package com.module3.java;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int [][] n = new int[5][4];
		
		String [][] n = new String[6][6];
		System.out.println("Size of array ="+n.length);
		
		for(int i=0; i<n.length;i++)
		{
			System.out.println("Size of n["+i+"]"+n[i].length);
		}
		
		for(int i=0; i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
			{
				System.out.println(n[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
