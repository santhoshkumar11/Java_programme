package com.module4.java;

class base
{  
base() 
{  System.out.println("In the base class..");
  test(); 
} 

void test() 
{  System.out.println("in the test function...");
  base b1 = new base();
 }
}  
public class test1 
{ 
public static void main (String args[]) 
{    
	System.out.println("fool");
base b1 = new base();     
}   
}