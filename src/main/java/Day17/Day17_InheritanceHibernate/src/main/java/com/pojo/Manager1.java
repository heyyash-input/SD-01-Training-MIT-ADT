package com.pojo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "Mgr_3")
@PrimaryKeyJoinColumn(name = "p_id")
public class Manager1 extends Employee1 {
	
	private String depart;

	public Manager1(int emp_id, String emp_name, double emp_salary, String depart) {
		super(emp_id, emp_name, emp_salary);
		depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		depart = depart;
	}

	@Override
	public String toString() {
		return "Manager1 [Depart=" + depart + "]";
	}
	
//	public Manager1() {
//		System.out.println("-------Constructor Manager1---------");
//	}
	
}
