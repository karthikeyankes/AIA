package com.iwebautomata.myexe.run;


import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;
public class RunMe {
	private static final Logger logger = LogManager.getLogger(RunMe.class);
	private static final MyExeInit myExeInit = new MyExeInit();  
	public static void main (String a[])
	{
		boolean start=false;
		try {
			
			myExeInit.runInit();
			start=true;
		}
		catch (Exception e) {System.out.println("Failed to Start");}
		
		if (start) {
			
			try
	        { 
	            
	            throw new CatchHereException("0"); 
	        } 
	        catch (CatchHereException ex) 
	        {  
	            System.out.println(ex.getMessage()); 
	        } 
		}
	}
}