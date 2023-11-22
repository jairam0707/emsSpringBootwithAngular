package com.example2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity

@Table(name = "employee")
public class Employee
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(length = 10)
	    private int emp_id;

	    @Column(length = 50)
	    private String emp_name;

	    @Column(unique = true)
	    private String emp_email;

	    @Column(unique = true)
	    private String emp_phone_no;

	    @Column(length = 20)
	    private String gender;

	    @Column(length = 15)
	    private String salary;

	    // Change: Removed @JsonIgnore from here
	    @JsonIgnore
	    @ManyToOne
	    @JoinColumn(name = "dept_id")
	    private Department department;

		public int getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		public String getEmp_name() {
			return emp_name;
		}

		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}

		public String getEmp_email() {
			return emp_email;
		}

		public void setEmp_email(String emp_email) {
			this.emp_email = emp_email;
		}

		public String getEmp_phone_no() {
			return emp_phone_no;
		}

		public void setEmp_phone_no(String emp_phone_no) {
			this.emp_phone_no = emp_phone_no;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public Employee(int emp_id, String emp_name, String emp_email, String emp_phone_no, String gender,
				String salary, Department department) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.emp_email = emp_email;
			this.emp_phone_no = emp_phone_no;
			this.gender = gender;
			this.salary = salary;
			this.department = department;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
}