package com.iwebautomata.myexe.run;

import com.iwebautomata.myexe.run.exception.CatchHereException;

public class RunMe {
	
	public static void main (String a[])
	{
		boolean start=false;
		try {
			MyExeInit.runInit();
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