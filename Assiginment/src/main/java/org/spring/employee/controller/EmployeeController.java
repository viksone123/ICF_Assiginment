package org.spring.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.spring.employee.entity.DependantsEntity;
import org.spring.employee.entity.EducationEntity;
import org.spring.employee.entity.EmployeeEntity;
import org.spring.employee.model.EmployeeModel;
import org.spring.employee.service.implementation.EmployeeImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ICF")
public class EmployeeController {

	@Autowired
	private EmployeeImplementation empService;

	@RequestMapping(value="/Employee/addEmployee", method=RequestMethod.POST , name = "AddEmployee")
	public ResponseEntity<String>  addEmployees(@RequestBody EmployeeModel empModel) 
	//input as JSON in body
	{
		empService.addEmployee(empModel);
		return new ResponseEntity<String>("Employee Added",HttpStatus.OK);
	}

	@RequestMapping(value="/Employee/deleteEmployee", method=RequestMethod.POST , name = "DeleteEmployee")
	public ResponseEntity<String>  deleteEmployees() 
	{
		empService.deleteEmployee();
		return new ResponseEntity<String>("All Employee Deleted",HttpStatus.OK);
	}

	@RequestMapping(value="/Employee/viewEmployee", method=RequestMethod.POST , name = "ViewEmployee")
	public List<EmployeeEntity> viewEmployees()
	{
		List<EmployeeEntity> ets = new ArrayList<EmployeeEntity>();
		return empService.viewEmployee(ets);
	}

	@RequestMapping(value="/Employee/findById", method=RequestMethod.POST , name = "FindEmployeeByID")
	public List<EmployeeEntity> findByIdEmployees(@RequestHeader String id) 
	//input ID as header
	{
		List<EmployeeEntity> ets = new ArrayList<EmployeeEntity>();
		return empService.findByIdEmployee(ets,id);
	}

	@RequestMapping(value="/Employee/findByName", method=RequestMethod.POST , name = "FindEmployeeByName")
	public List<EmployeeEntity> findByNameEmployees(@RequestHeader String name) 
	//input FirstName as header
	{
		List<EmployeeEntity> ets = new ArrayList<EmployeeEntity>();
		return empService.findByNameEmployee(ets,name);
	}

	@RequestMapping(value="/Dependants/findByName", method=RequestMethod.POST , name = "FindDependantByName")
	public List<DependantsEntity> findByNameDependants(@RequestHeader String name) 
	//input FirstName as header
	{
		List<DependantsEntity> dep = new ArrayList<DependantsEntity>();
		return empService.findByNameDependants(dep,name);
	}

	@RequestMapping(value="/Dependants/findById", method=RequestMethod.POST , name = "FindDependantByID")
	public List<DependantsEntity> findByIdDependants(@RequestHeader String id) 
	//input ID as header
	{
		List<DependantsEntity> dep = new ArrayList<DependantsEntity>();
		return empService.findByIdDependants(dep,id);
	}

	@RequestMapping(value="/Education/findByType", method=RequestMethod.POST , name = "FindEducationByType")
	public List<EducationEntity> findByTypeEducation(@RequestHeader String type) 
	//input FirstName as header
	{
		List<EducationEntity> edu = new ArrayList<EducationEntity>();
		return empService.findByTypeEducation(edu,type);
	}

	@RequestMapping(value="/Education/findById", method=RequestMethod.POST , name = "FindEducationByID")
	public List<EducationEntity> findByIdEducation(@RequestHeader String id) 
	//input ID as header
	{
		List<EducationEntity> edu = new ArrayList<EducationEntity>();
		return empService.findByIdEducation(edu,id);
	}

}