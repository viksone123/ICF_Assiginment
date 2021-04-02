package org.spring.employee.repositry;

import java.util.List;

import org.spring.employee.entity.EducationEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EducationRepos extends CrudRepository<EducationEntity, String> {

	@Query("select e from #{#entityName} e where e.id= ?1")
	public List<EducationEntity> findById(String id);

	@Query("select e from #{#entityName} e where e.type= ?1") 
	public	List<EducationEntity> findByType(String type);

	@Query("select e from #{#entityName} e where e.startDate= ?1") 
	public	List<EducationEntity> findByStartDate(String startDate);

}
