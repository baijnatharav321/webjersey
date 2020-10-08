package com.mindtree.employeeManagement;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Test;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.test.JerseyTest;

public class EmployeeDaoTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(EmployeeService.class);
	}

	@Test
	public void getEmployeeById() {
		Response response = target("/EmployeeManagement/getEmployeeById/1").request().get();

		assertEquals("It will return status 200", 200, response.getStatus());

		assertNotNull("It will  return list", response.getEntity());
	}

	@Test
	public void getAllEmployee() {
		Response response = target("/EmployeeManagement").request().get();
		assertEquals("It will  return status 200", 200, response.getStatus());
		assertNotNull("It will  return list", response.getEntity());
	}

	@Test
	public void addEmployee() {
		Map<String, String> testData = new HashMap<String, String>();
		testData.put("employeeId", "1");
		testData.put("employeeName", "Priya");
		testData.put("employeeExperience", "9");
		testData.put("employeeDesignation", "HR");
		testData.put("employeeSalary", "50,000");
		Response output = target("/EmployeeManagement/addEmployee").request().post(Entity.json(testData),
				Response.class);
		assertEquals("It will return status 201", 201, output.getStatus());
		assertNotNull("It will return list", output.getEntity());
	}

	@Test
	public void deleteEmployeeById() {
		Response output = target("/EmployeeManagement/deleteEmployeeById/1").request().delete();

		assertEquals("It will return status 200", 200, output.getStatus());

		assertNotNull("It will return list", output.getEntity());
	}

}
