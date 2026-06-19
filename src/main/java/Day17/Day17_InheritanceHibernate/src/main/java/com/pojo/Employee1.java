package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emp3_hib_In")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee1 {
//----------------------------------------------------------------------------------------------------	
	@Id
	private int emp_id ;
	@Column
	private String emp_name;
	@Column
	private double emp_salary ;
//-----------------------------------------------------------------------------------------------------	
	public Employee1(int emp_id, String emp_name, double emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
//----------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Employee1 [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
//----------------------------------------------------------------------------------------------------
	public int getEmp_id() {
		return emp_id;
	}
//-----------------------------------------------------------------------------------------------------
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
//----------------------------------------------------------------------------------------------------	
}
