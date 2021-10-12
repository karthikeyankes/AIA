package com.iwebautomata.myexe.run;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class RunMe {
	private static final Logger log = LogManager.getLogger(RunMe.class);
	private static final MyExeInit myExeInit = new MyExeInit();  
	public static void main (String a[])
	{
		boolean start=false;
		//BasicConfigurator.configure();  
		log.info("...Start the AIA...... ");  
		try {
			
			myExeInit.runInit();
			myExeInit.runInitlog();
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
	            log.error(ex.getMessage()); 
	        } 
		}
		log.info("...End the AIA...... "); 
	}
}