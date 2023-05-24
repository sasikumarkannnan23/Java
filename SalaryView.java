package com.sk.view;
import com.sk.controller.SalaryController;
import java.util.Scanner;

public class SalaryView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SalaryController sac = new SalaryController();
		System.out.println("Salary Calculator");
		System.out.println("Enter Basic pay");
		double basic = sc.nextDouble();
		sac.SetBasic(basic);
		while(true) {
			System.out.println("1 Calculated Salary");
			System.out.println("2 Showing Salary");
			System.out.println("Exit");
			int option = sc.nextInt();
			boolean bIsExit = false;
			switch(option) {
			case 1:
				sac.CalculatedSalary();
				break;
			case 2:
				sac.ShowSalary();
				break;
			case 3:
				bIsExit = true;
				break;
			}
			if(bIsExit)
				break;
			
			}
			
			sc.close();
			System.out.println("Done");
	}

	
}
