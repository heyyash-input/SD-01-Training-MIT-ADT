package com.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "empdtls")
public class EmployeeDetails {
  
	@Id
    @GenericGenerator(
        name = "gen",
        strategy = "foreign",
        parameters = @Parameter(name = "property", value = "emp")
    )
    @GeneratedValue(generator = "gen")
    private int empid;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String email;

    @OneToOne
    @PrimaryKeyJoinColumn
    private MyEmployee emp;
		 
	
	
	public EmployeeDetails(int empid, String city, String state, String email) {
		super();
		this.empid = empid;
		this.city = city;
		this.state = state;
		this.email = email;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", city=" + city + ", state=" + state + ", email=" + email + "]";
	}
	
	
	
}
