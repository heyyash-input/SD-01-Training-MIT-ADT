package com.pojo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sales_3")
@PrimaryKeyJoinColumn(name = "S_id")
public class SalesPerson1 extends Employee1 {
	private int allowance;

	public SalesPerson1(int emp_id, String emp_name, double emp_salary, int allowance) {
		super(emp_id, emp_name, emp_salary);
		this.allowance = allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "SalesPerson1 [allowance=" + allowance + "]";
	}
	
//	public SalesPerson1() {
//		// error:Implicit super constructor Employee1() is undefined. Must explicitly invoke another constructor
//		System.out.println("Create");
//	}
	
	
}	
