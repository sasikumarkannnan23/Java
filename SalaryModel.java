package com.sk.model;

public class SalaryModel {
	double basicpay;
	double HRA;
	double TA;
	double DA;
public void CalCulateSalary()
{
	System.out.println("Calculating Salary payroll");
	this.HRA = this.basicpay * (10.0/100.0);
	this.TA = this.basicpay * 0.6;
	this.DA = this.basicpay * 0.14;

}
public double getBasic() {
	return basicpay;
}
public void setBasic(double basic) {
	this.basicpay = basic;
}
public double getHRA() {
	return HRA;
}
public double getTA() {
	return TA;
}
public double getDA() {
	return DA;
}

}
