package org.spring.employee.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.employee.controller.EmployeeController;
import org.spring.employee.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmployeeController.class)
@ActiveProfiles(profiles = "test")
@WebAppConfiguration

public class TestCase {

	@Autowired
	EmployeeController controller;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
	private MockMvc mockMvc;

	@Test
	@Ignore
	public void test01AddEmployee() throws Exception
	{
		System.out.println("### testaddEmployee() Begin");
		EmployeeModel employee = new EmployeeModel();
		employee.setAddress("4th cross Bangalore");
		employee.setFirstName("ABC");
		employee.setBloodGroup("o+");
		employee.setDepartment("R&D");
		employee.setDesignation("Software Engineer");
		employee.setdOB("18-12-1992");
		employee.setGender("MALE");
		employee.setStatus("ACTIVE");
		employee.setReportingManager("John Smith");
		employee.setStartDate("12-06-2015");
		employee.setEndDate("null");
		employee.setId("0001");
		employee.setLastName("DEF");
		System.out.println(employee.toString());
		System.out.println("### testaddEmployee() End");
//		mockMvc.perform(post("/ICF/addEmployee/").toString()(employee).contentType(contentType)).andExpect(status().isOk()).andReturn();
	}​​​​ 
	
}}
