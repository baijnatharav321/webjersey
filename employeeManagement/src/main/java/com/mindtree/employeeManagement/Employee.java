package com.mindtree.employeeManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String EmployeeId;
	private String EmployeeName;
	private String EmployeeDesignation;
	private String EmployeeSalary;
	private String EmployeeExperience;
	public Employee() {
		super();
	}
	public Employee(String employeeId, String employeeName, String employeeDesignation, String employeeSalary,
			String employeeExperience) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeDesignation = employeeDesignation;
		EmployeeSalary = employeeSalary;
		EmployeeExperience = employeeExperience;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeeExperience() {
		return EmployeeExperience;
	}
	public void setEmployeeExperience(String employeeExperience) {
		EmployeeExperience = employeeExperience;
	}

	
}
