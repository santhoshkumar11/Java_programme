package com.module3.java;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][][] data = new double [4][][];
		
		data[0] = new double[3][4];
		data[1] = new double[5][4];
		data[2] = new double[7][4];
		data[3] = new double[8][4];
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println("the array value is data:["+i+"] ="+data[i].length);
		}
	}

}
