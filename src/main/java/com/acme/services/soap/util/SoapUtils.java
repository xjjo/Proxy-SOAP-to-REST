package com.acme.services.soap.util;

import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;

import a.b.c.CalculatorPortType;

public class SoapUtils {
		@Autowired
	    private CalculatorPortType calculatorServiceImpl;

	    public void add(Exchange exchange) {
	       
	    	int result = calculatorServiceImpl.add(1, 2);
	    	System.out.println("resultado de la suma: "+result );
	    	/*  java.lang.String response = applicationService.getApplication();
	         ..or..
	         Application application = new Application(); //or whichever way you generate this.
	         User user = new User(); //or which ever way u generate this.
	         ApplicationResult result = applicationService.addApplication(application,user);
	         ...*/
	    }
}
