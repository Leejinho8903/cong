package com.greedy.common;

public class EmployeeDTO {

	private int empNo;
	private String empId;
	private String empPwd;
	private String empRrn;
	private String empName;
	private String phone;
	private String email;
	
	public EmployeeDTO() {}

	public EmployeeDTO(int empNo, String empId, String empPwd, String empRrn, String empName, String phone, String email) {
		super();
		this.empNo = empNo;
		this.empId = empId;
		this.empPwd = empPwd;
		this.empRrn = empRrn;
		this.empName = empName;
		this.phone = phone;
		this.email = email;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpRrn() {
		return empRrn;
	}

	public void setEmpRrn(String empRrn) {
		this.empRrn = empRrn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", empId=" + empId + ", empPwd=" + empPwd + ", empRrn=" + empRrn
				+ ", empName=" + empName + ", phone=" + phone + ", email=" + email + "]";
	}

	
	
	
}
