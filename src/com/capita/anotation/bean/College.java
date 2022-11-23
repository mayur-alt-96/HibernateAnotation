package com.capita.anotation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import sun.nio.cs.Surrogate.Generator;

@Entity
@Table(name = "COLLEGE")
public class College {

	@Id
	@Column(name = "collegeName")
	private String collegeName;

	@Column(name = "collegeDept")
	private String collegeDept;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeDept() {
		return collegeDept;
	}

	public void setCollegeDept(String collegeDept) {
		this.collegeDept = collegeDept;
	}

}
