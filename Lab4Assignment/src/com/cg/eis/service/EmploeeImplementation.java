
package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

/**
 *EmployeeServiceImpl implements the EmployeeService interface by providing  logic for the methods
 * @author Cheerala Prathika
 *
 */

public class EmploeeImplementation implements EmployeeService{
	Scanner sc=new Scanner(System.in);
	@Override
	public Employee getDetails() {
		System.out.println("Enter the employee id");
		int id =sc.nextInt();
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee designation (Manager,Developer,Trainer)");
		String designation=sc.next();
		System.out.println("Enter the employee salary");
		double salary=sc.nextDouble();
		Employee e=new Employee(id,name,designation,salary);
		return e;
	}

	@Override
	public String getScheme(double salary, String designation) {
		if(salary>=25000 && salary<=50000 && designation.equalsIgnoreCase("Manager"))
			return "Medical insurance";
		else if(salary>=20000 && salary<=35000 && designation.equalsIgnoreCase("Developer"))
			return "Home insurance";
		else if(salary>=12000 && salary<=20000 && designation.equalsIgnoreCase("Trainer"))
			return "Vehicle insurance";
		else
			return "No insurance available";
			
	}
	
	
	@Override
	public void DisplayDetails(Employee e) {
	    System.out.println("-----------Employee Details---------");
	    System.out.println("ID: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Designation: "+e.getDesignation());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Insurance Scheme: "+e.getInsuranceScheme());
	}
}
