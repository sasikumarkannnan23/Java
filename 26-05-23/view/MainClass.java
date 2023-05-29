package com.sk.view;
import com.sk.contrller.ControllerIOClass;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import com.sk.exception.*;
public class MainClass {

	public static void main(String[] args) {
		try {
		System.out.println("Welcome to EMS :)");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		System.out.println("Enter user name");
		String usr = bf.readLine();
		System.out.println("Enter password");
		String pass = bf.readLine();
		System.out.println("Please wait loading...");
		Thread.sleep(3000);
		if(!usr.equals("sara") && !pass.equals("May"))
		{
			throw new UserIONotFound();
		}
		ControllerIOClass cc = new ControllerIOClass();
		Scanner sc = new Scanner(System.in);
		String co = null;
		do {
			
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				cc.addEmployee();
				break;
			case 2:
				cc.ViewEmployee();
				break;
			default:
				System.out.println("Enter valid number");
				break;
			}
			System.out.println("Do you want to continue y/n");
			co = sc.next();
			
		}while(co.equals("y") || co.equals("Y"));
		}
		catch(UserIONotFound un) {
			un.printStackTrace();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Exit Application");
		System.exit(0);
			
		
	}

}