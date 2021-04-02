package org.spring.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Education")
public class EducationEntity {

	@Id
	@Column(name = "ID" , nullable = false)
	private String id;

	@Column(name = "Type")
	private String type;

	@Column(name = "Start_Date")
	private String startDate;

	@Column(name = "End_Date")
	private String endDate;

	@Column(name = "Institution")
	private String institution;

	@Column(name = "Percentage")
	private String percentage;

	@Column(name = "Address")
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EducationEntity [id=" + id + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", institution=" + institution + ", percentage=" + percentage + ", address=" + address + "]";
	}
}
