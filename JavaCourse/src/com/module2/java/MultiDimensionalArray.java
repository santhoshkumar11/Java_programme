package com.module2.java;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n = new int[5][4];
		System.out.println("size of array is="+n.length);
		
		for(int i=0;i<n.length;i++)
		{
			System.out.println("size of n["+i+"] = "+ n[i].length);
		}
	}

}
