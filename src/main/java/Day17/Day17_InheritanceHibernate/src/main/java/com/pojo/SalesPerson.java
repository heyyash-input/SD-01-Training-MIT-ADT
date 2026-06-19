package com.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "salesType")
public class SalesPerson extends Employee{
//---------------------------------------------------------------------------------------------------	
	@Column
	 private int allowance;
//--------------------------------------------------------------------------------------------------

public SalesPerson(int emp_id, String emp_name, double emp_salary, int allowance) {
	super(emp_id, emp_name, emp_salary);
	this.allowance = allowance;
}
//---------------------------------------------------------------------------------------------------

@Override
public String toString() {
	return "SalesPerson [allowance=" + allowance + "]";
}
//--------------------------------------------------------------------------------------------------

public int getAllowance() {
	return allowance;
}

public void setAllowance(int allowance) {
	this.allowance = allowance;
}
//---------------------------------------------------------------------------------------------------
public SalesPerson () {
	System.out.println("----------Default SalesPerson Constructor called-----------");
}
	 
	 

}
