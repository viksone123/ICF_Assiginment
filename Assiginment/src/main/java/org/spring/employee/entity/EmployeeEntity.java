package org.spring.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Employee")
public class EmployeeEntity {

	@Id
	@Column(name = "ID" , nullable = false)
	private String id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Start_Date")
	private String startDate;

	@Column(name = "End_Date")
	private String endDate;

	@Column(name = "Employee_ID")
	private String employeeID;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "Department")
	private String department;

	@Column(name = "Status")
	private String status;

	@Column(name = "DOB")
	private String dOB;

	@Column(name = "Reporting_Manager")
	private String reportingManager;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Blood_Group")
	private String bloodGroup;

	@Column(name = "Address")
	private String address;

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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", employeeID=" + employeeID + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", dOB=" + dOB + ", reportingManager="
				+ reportingManager + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + "]";
	}

}