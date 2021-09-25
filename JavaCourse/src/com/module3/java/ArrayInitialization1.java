package com.module3.java;

public class ArrayInitialization1 {

	static void arrayIteration(int[][] n)
	{
		for (int [] x:n)
		{
			for (int y: x)
			{
			System.out.println(y+"");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]n = {{1,2,3},{4,5,6,7},{8,9}};
		System.out.println("Array length is "+n.length);
		
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Size of n["+i+"]"+n[i].length);
		}
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
			{
				System.out.println(n[i][j]);
			}
		}
		
		arrayIteration(n);
		
	}

}
