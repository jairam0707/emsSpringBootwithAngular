package com.example2.model;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id",length=45)
	private int employeeid;
	
	@Column(name="employee_name",length=45)
	private String employeename;
	
	@Column(name="address",length=45)
	private String address;
	
	@Column(name="mobile",length=45)
	private int mobile;
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Employee(int employeeid, String employeename, String address, int mobile) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.address = address;
		this.mobile = mobile;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}

}
