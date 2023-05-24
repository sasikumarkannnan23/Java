package com.sk.controller;
import com.sk.model.SalaryModel;
public class SalaryController {
	SalaryModel salr = new SalaryModel();
	   
	   public void SetBasic(double Sal) {
		   salr.setBasic(Sal);
		   
		   
	   }
	   public void CalculatedSalary() {
		   System.out.println("Controller CalculatedSalary");
		   salr.CalCulateSalary();
	   }
	   public void ShowSalary() {
		   System.out.println("BasicPay :" +salr.getBasic());
		   System.out.println("HRA :" + salr.getHRA());
		   System.out.println("DA :"+salr.getDA());
		   System.out.println("TA :"+salr.getTA());
		   double Gross = salr.getBasic() + salr.getHRA() + salr.getDA() + salr.getTA();
		   System.out.println("Gross :"+ Gross);
	   }
}
