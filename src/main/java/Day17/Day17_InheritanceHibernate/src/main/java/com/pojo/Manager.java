package com.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "mgrType") 
public class Manager extends Employee {
//--------------------------------------------------------------------------------------------------
	@Column
	private String Depart;
//--------------------------------------------------------------------------------------------------
	public Manager(int emp_id, String emp_name, double emp_salary, String depart) {
		super(emp_id, emp_name, emp_salary);
		Depart = depart;
	}
//----------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Manager [Depart=" + Depart + "]";
	}
	public String getDepart() {
		return Depart;
	}
	public void setDepart(String depart) {
		Depart = depart;
	}
//---------------------------------------------------------------------------------------------------
	public Manager () {
		System.out.println("----------Default Manager Constructor called-----------");
	}
//-----------------------------------------------------------------------------------------------------	
}
