package com.mindtree.employeeManagement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {

	private static Map<String, Employee> employeeDetails;

	public EmployeeDao() {

		employeeDetails = new HashMap<String, Employee>();
		Employee employee1 = new Employee("1", "HR", "5", "Priya", "50,000");
		Employee employee2 = new Employee("2", "Project Manager", "9", "Gunjan", "90,000");
		employeeDetails.put(employee1.getEmployeeId(), employee1);
		employeeDetails.put(employee2.getEmployeeId(), employee2);
	}

	Collection<Employee> getEmployeeDetails() {
		System.out.println("Employee details" + employeeDetails);
		return employeeDetails.values();
	}

	Employee getEmployeeById(String Id) {
		return employeeDetails.get(Id);
	}

	void deleteEmployeeById(String Id) {
		employeeDetails.remove(Id);
		System.out.println("Employee details" + employeeDetails);
	}

	void addEmployee(Employee employee) {
		employeeDetails.put(employee.getEmployeeId(), employee);
        System.out.println("Employee Details" + employeeDetails);
	}

}
