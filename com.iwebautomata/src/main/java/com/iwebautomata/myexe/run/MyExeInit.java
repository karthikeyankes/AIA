package com.iwebautomata.myexe.run;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

public class MyExeInit {
	final static String BASIC_PATH=System.getenv("MYEXE_HOME");
	final static String ERROR_PRO="\\bin\\error.pro";
	final static String BASIC_ERROR="-1:Undefined ERROR";
	final static String LOG4J_PRO="\\bin\\log.pro";
	final  void runInit() throws Exception {
		InputStream input = new FileInputStream(BASIC_PATH+ERROR_PRO) ;

            Properties prop = new Properties();
            prop.load(input);
            //System.out.println(BASIC_PATH);
        
	}
	final  void runInitlog() throws Exception {
		InputStream input = new FileInputStream(BASIC_PATH+LOG4J_PRO) ;

            Properties prop = new Properties();
            prop.load(input);
            //System.out.println(BASIC_PATH);
        
	}
	
}
