package com.module3.java;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb+"|Size ="+sb.length()+"|Capacity="+sb.capacity());
		
		sb.append("Santhosh");
		System.out.println(sb+"|Size ="+sb.length()+"|Capacity="+sb.capacity());
		
		sb.append("kumar sathyamoorthy");
		System.out.println(sb+"|Size ="+sb.length()+"|Capacity="+sb.capacity());
	}

}
