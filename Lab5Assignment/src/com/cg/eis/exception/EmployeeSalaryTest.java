/**
 * @author Cheerala Prathika
 *	Date:1/11/2020
 */


package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalaryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeException emp = new EmployeeException();
		System.out.println("Enter the salary:");
		double salary = sc.nextInt();
		// try and catch implementation
		try { 
			emp.checkSalary(salary);
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}

	}
}
