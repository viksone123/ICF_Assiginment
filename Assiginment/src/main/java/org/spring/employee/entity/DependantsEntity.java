package org.spring.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Dependants")
public class DependantsEntity {

	@Id
	@Column(name = "ID" , nullable = false)
	private String id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "DOB")
	private String dOB;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Relationship")
	private String relationship;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "DependantsEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dOB=" + dOB
				+ ", gender=" + gender + ", relationship=" + relationship + "]";
	}

}
