package com.sk.model;

public class ModelIOClass {
	String empname;
	int empno;
	
	public void setEmpNo(int EmpNo)
	{
		this.empno = EmpNo;
	}
	
	public void setEmpName(String EmpName)
	{
		this.empname = EmpName;
	}
	
	public int getEmpNo() {
		return empno;
	}

	public String getEmpName()
	{
		return empname;
	}

	
	@Override
	public String toString() {
		return "ModelClass [empname=" + empname + ", empno=" + empno + "]";
	}
}
