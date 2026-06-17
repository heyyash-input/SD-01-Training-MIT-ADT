package com.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MyEmployee {
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;//203
	@Column
	private String name;
	@Column
	private double salary;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "MyEmployee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public MyEmployee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	
}
