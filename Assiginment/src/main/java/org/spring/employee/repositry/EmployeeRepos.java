package org.spring.employee.repositry;

import java.util.List;

import org.spring.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepos extends CrudRepository<EmployeeEntity, String> {

	@Query("select e from #{#entityName} e where e.id= ?1")
	public List<EmployeeEntity> findById(String id);

	@Query("select e from #{#entityName} e where e.firstName= ?1") 
	public	List<EmployeeEntity> findByName(String name);

	@Query("select e from #{#entityName} e where e.employeeID= ?1") 
	public	List<EmployeeEntity> findByEmployeeID(String empid);

	@Query("select e from #{#entityName} e where e.designation= ?1") 
	public	List<EmployeeEntity> findByDesignation(String designation);

}
