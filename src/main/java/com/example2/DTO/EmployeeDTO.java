package com.example2.DTO;
public class EmployeeDTO
{
private int employeeid;
	
private String employeename;
	
private String address;
	
private int mobile;
	
	public EmployeeDTO(int employeeid, String employeename, String address, int mobile) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.address = address;
		this.mobile = mobile;
	}
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
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
}

