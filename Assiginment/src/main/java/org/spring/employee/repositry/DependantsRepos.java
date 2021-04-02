package org.spring.employee.repositry;

import java.util.List;

import org.spring.employee.entity.DependantsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DependantsRepos extends CrudRepository<DependantsEntity, String> {

	@Query("select e from #{#entityName} e where e.id= ?1")
	public List<DependantsEntity> findById(String id);

	@Query("select e from #{#entityName} e where e.firstName= ?1") 
	public	List<DependantsEntity> findByName(String name);
}
