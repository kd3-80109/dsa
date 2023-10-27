package com.sunbeam;

import com.sunbeam.Employee;

public class TesterMain {

	//Search Employee by ID
	public static Employee searchById(Employee empArr[],int size,int empId)
	{
		Employee emp=new Employee();
		for(int i=0;i<size-1;i++)
		{
			if(empArr[i].getEmpId()==empId)
				emp=empArr[i];
		}
		return emp;
	}
	
	//Search Employee by Name
	public static Employee searchByName(Employee empArr[],int size,String name)
	{
		Employee emp=new Employee();
		for(int i=0;i<size-1;i++)
		{
			if(empArr[i].getName().equals(name))
				emp=empArr[i];
		}
		return emp;
	}

	//Search Employee by Salary
	public static Employee searchBySalary(Employee empArr[],int size,double salary)
	{
		Employee emp=new Employee();
		for(int i=0;i<size-1;i++)
		{
			if(empArr[i].getSalary()==salary)
				emp=empArr[i];
		}
		return emp;
	}
	
	public static void main(String[] args) {

		Employee[] empArr=new Employee[5];
		empArr[0]=new Employee(121,"Jhon",24000);
		empArr[1]=new Employee(124,"Loss",23000);
		empArr[2]=new Employee(123,"Dehadi",22000);
		empArr[3]=new Employee(125,"Jack",21000);
		empArr[4]=new Employee(122,"King",25000);
		
		System.out.println("Search by id:"+searchById(empArr,5,124));
		System.out.println("Search by name:"+searchByName(empArr,5,"Dehadi"));
		System.out.println("Search by salary:"+searchBySalary(empArr,5,21000));
	}

}