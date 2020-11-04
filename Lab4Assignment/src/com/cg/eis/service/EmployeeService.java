package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public Employee getDetails();
	
	public String getScheme(double salary,String designation);
	
	public void DisplayDetails(Employee e);


}
