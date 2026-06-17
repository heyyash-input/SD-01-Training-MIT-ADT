package com.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Employee {
	
	@Id
	private int id ;
	@Column
	private String empSalary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empSalary=" + empSalary + "]";
	}

	public Employee(int id, String empSalary) {
		super();
		this.id = id;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
}
