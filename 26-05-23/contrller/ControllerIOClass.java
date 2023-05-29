package com.sk.contrller;
import com.sk.model.ModelIOClass;
public class ControllerIOClass {
	ModelIOClass mic = new ModelIOClass();
	public void addEmployee()
	{
		
	//	sc.nextLine();
		mic.setEmpName("BAlA"); 
		mic.setEmpNo(101);
		
		
	}
    public void ViewEmployee()
    {
    	//System.out.println("Employe Name:"+mc.getEmpName());
		//System.out.println("Employee No:"+mc.getEmpNo());
    	System.out.println(mic);
    }
	
}
