package com.module3.java;

public class Employee {

	int empNo;
	String name;
	float salary;
	
	void setData()
	{
		empNo =1233;
		name ="Priyanka";
		salary =565656.366f;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setData();
		System.out.println("employee no is"+emp.empNo+"employee name is "+emp.name +emp.salary);
		
		/* set values to properties using reference*/
		emp.empNo = 11;
		emp.name = "Santhosh";
		emp.salary= 5500.336f;
		System.out.println("employee no is"+emp.empNo+"employee name is "+emp.name +emp.salary);
		
		/* set properties using method*/
		

	}

}
