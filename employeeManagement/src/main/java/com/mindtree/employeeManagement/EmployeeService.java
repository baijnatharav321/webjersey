package com.mindtree.employeeManagement;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/EmployeeManagement")
public class EmployeeService {

	static EmployeeDao employeeDao = new EmployeeDao();
	
	@GET
	@Path("/getEmployeeById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById(@PathParam("id") String id) {
		System.out.println("id" + id);
		return employeeDao.getEmployeeById(id);
	}

	@GET
	@Path("/getAllEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Employee> getAllEmployee() {
		employeeDao = new EmployeeDao();
		return employeeDao.getEmployeeDetails();
	}

	@POST
	@Path("/addEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEmployee(Employee employee) {
		System.out.println("employee" + employee);
		employeeDao.addEmployee(employee);
		return Response.status(Status.CREATED).entity("Employee Details Are Successfully Inserted").build();
	}
	

	@DELETE
	@Path("/deleteEmployeeById/{id}")
	public Response deleteEmployeeById(@PathParam("id") String id) {
		System.out.println("id" + id);
		employeeDao.deleteEmployeeById(id);
		return Response.status(Status.OK).entity("Deleted Successfully").build();
	}

	
}
