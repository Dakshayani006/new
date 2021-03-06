
package com.scholastic.intl.esb.integration.wsdl.palm;

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
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-06-02T10:33:16.640+05:30
 * Generated source version: 3.1.7
 * 
 */
public final class JadeNetsuiteOrgProviderSoap_JadeNetsuiteOrgProviderSoap_Client {

    private static final QName SERVICE_NAME = new QName("urn:JadeWebServices/NetsuiteCustomer/", "JadeNetsuiteOrgProvider");

    private JadeNetsuiteOrgProviderSoap_JadeNetsuiteOrgProviderSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = JadeNetsuiteOrgProvider.WSDL_LOCATION;
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
      
        JadeNetsuiteOrgProvider ss = new JadeNetsuiteOrgProvider(wsdlURL, SERVICE_NAME);
        JadeNetsuiteOrgProviderSoap port = ss.getJadeNetsuiteOrgProviderSoap();  
        
        {
        System.out.println("Invoking updateClient...");
        com.scholastic.intl.esb.integration.wsdl.palm.NSIClient _updateClient_nsClient = null;
        java.lang.String _updateClient__return = port.updateClient(_updateClient_nsClient);
        System.out.println("updateClient.result=" + _updateClient__return);


        }
        {
        System.out.println("Invoking addParent...");
        com.scholastic.intl.esb.integration.wsdl.palm.NSIOrganisation _addParent_organisation = null;
        java.lang.String _addParent__return = port.addParent(_addParent_organisation);
        System.out.println("addParent.result=" + _addParent__return);


        }
        {
        System.out.println("Invoking updateParent...");
        com.scholastic.intl.esb.integration.wsdl.palm.NSIOrganisation _updateParent_organisation = null;
        java.lang.String _updateParent__return = port.updateParent(_updateParent_organisation);
        System.out.println("updateParent.result=" + _updateParent__return);


        }

        System.exit(0);
    }

}
