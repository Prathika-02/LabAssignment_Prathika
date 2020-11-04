package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmploeeImplementation;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee();
		EmploeeImplementation empimp=new EmploeeImplementation();
		emp=empimp.getDetails();
		String insurance_scheme=empimp.getScheme(emp.getSalary(),emp.getDesignation());
		emp.setInsuranceScheme(insurance_scheme);
		empimp.DisplayDetails(emp);
	}
}
