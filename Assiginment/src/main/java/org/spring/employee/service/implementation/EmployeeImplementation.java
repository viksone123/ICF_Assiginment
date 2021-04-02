package org.spring.employee.service.implementation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.employee.entity.DependantsEntity;
import org.spring.employee.entity.EducationEntity;
import org.spring.employee.entity.EmployeeEntity;
import org.spring.employee.model.EmployeeModel;
import org.spring.employee.repositry.DependantsRepos;
import org.spring.employee.repositry.EducationRepos;
import org.spring.employee.repositry.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImplementation {

	@Autowired
	private EmployeeRepos empRepos;

	@Autowired
	private DependantsRepos depRepos;

	@Autowired
	private EducationRepos eduRepos;

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeImplementation.class);

	public void addEmployee(EmployeeModel empModel)
	{
		LOG.info("Entry to addEmployee()"+empModel);
		EmployeeEntity employee=new EmployeeEntity();
		employee.setAddress(empModel.getAddress());
		employee.setFirstName(empModel.getFirstName());
		employee.setBloodGroup(empModel.getBloodGroup());
		employee.setDepartment(empModel.getDepartment());
		employee.setDesignation(empModel.getDesignation());
		employee.setdOB(empModel.getdOB());
		employee.setGender(empModel.getGender());
		employee.setStatus(empModel.getStatus());
		employee.setReportingManager(empModel.getReportingManager());
		employee.setStartDate(empModel.getStartDate());
		employee.setEndDate(empModel.getEndDate());
		employee.setId(empModel.getId());
		employee.setLastName(empModel.getLastName());
		empRepos.save(employee);
		LOG.info("Exit to addEmployee()"+empModel);
	}

	public void deleteEmployee() {
		LOG.info("Deleting all Employees");
		empRepos.deleteAll();

	}
	public List<EmployeeEntity> viewEmployee(List<EmployeeEntity> ets) {
		LOG.info("Viewing all Employees");
		ets = (List<EmployeeEntity>) empRepos.findAll();
		return ets;
	}

	public List<EmployeeEntity> findByIdEmployee(List<EmployeeEntity> ets, String id) {
		LOG.info("Searching Employee by ID: "+id);
		ets= empRepos.findById(id);
		return ets;
	}

	public List<EmployeeEntity> findByNameEmployee(List<EmployeeEntity> ets, String name) {
		LOG.info("Searching Employee by Name: "+name);
		ets = empRepos.findByName(name);
		return ets;
	}

	public List<DependantsEntity> findByNameDependants(List<DependantsEntity> dep, String name) {
		LOG.info("Searching Dependant by Name: "+name);
		dep = depRepos.findByName(name);
		return dep;
	}

	public List<DependantsEntity> findByIdDependants(List<DependantsEntity> dep, String id) {
		LOG.info("Searching Dependant by ID: "+id);
		dep= depRepos.findById(id);
		return dep;
	}

	public List<EducationEntity> findByTypeEducation(List<EducationEntity> edu, String type) {
		LOG.info("Searching Education by Type: "+type);
		edu = eduRepos.findByType(type);
		return edu;
	}

	public List<EducationEntity> findByIdEducation(List<EducationEntity> edu, String id) {
		LOG.info("Searching Education by ID: "+id);
		edu= eduRepos.findById(id);
		return edu;
	}

}