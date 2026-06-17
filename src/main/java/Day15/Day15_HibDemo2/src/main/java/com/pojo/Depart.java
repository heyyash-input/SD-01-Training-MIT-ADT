package com.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Embeddable
public class Depart {
	
	@Id
	private int id ;
	@Column
	private String  emp_name ;
	@Column
	private double salary;
	
	@Embedded
	private Employee employee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Depart [id=" + id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	
	public Depart(int id, String emp_name, double salary) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	public Depart() {
		System.out.println("-------Depart Constructor-----");
	}

	
}
