
package a.b.c;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630187
 * 2017-12-28T06:04:42.443-08:00
 * Generated source version: 3.1.5.redhat-630187
 * 
 */
public final class CalculatorPortType_CalculatorHttpsSoap11Endpoint_Client {

    private static final QName SERVICE_NAME = new QName("http://c.b.a", "Calculator");

    private CalculatorPortType_CalculatorHttpsSoap11Endpoint_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Calculator.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Calculator ss = new Calculator(wsdlURL, SERVICE_NAME);
        CalculatorPortType port = ss.getCalculatorHttpsSoap11Endpoint();  
        
        {
        System.out.println("Invoking add...");
        java.lang.Integer _add_n1 = null;
        java.lang.Integer _add_n2 = null;
        java.lang.Integer _add__return = port.add(_add_n1, _add_n2);
        System.out.println("add.result=" + _add__return);


        }

        System.exit(0);
    }

}