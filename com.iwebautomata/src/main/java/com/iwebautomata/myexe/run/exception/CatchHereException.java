package com.iwebautomata.myexe.run.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class CatchHereException extends Exception 
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final static String BASIC_PATH=System.getenv("MYEXE_HOME");
	final static String ERROR_PRO="\\bin\\error.pro";
	final static String BASIC_ERROR="-1:Undefined ERROR";
	

	public CatchHereException(String errorcode) 
    { 
		
        super( getErrorCode(  errorcode)); 
    } 
	
	final static String getErrorCode( String errorcode) {
		String errormessage="";
		try (InputStream input = new FileInputStream(BASIC_PATH+ERROR_PRO)) {

            Properties prop = new Properties();
            prop.load(input);
            errormessage=prop.getProperty(errorcode);
        } catch (IOException ex) {
        	errormessage="";
        }
		
		if(errormessage !=null && !errormessage.equals(""))
		{
			return errorcode+"->"+errormessage;
		}else {
			return BASIC_ERROR;
		}
	}
} 