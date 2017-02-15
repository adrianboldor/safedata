
package safedata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Policy", targetNamespace = "http://policy.apiV2.server.backup.r1soft.com/", wsdlLocation = "file:/E:/IntelliJp/safedata/src/main/java/safedata/view-source_safedata1.r1soft.ro_9080_Policy2_wsdl.wsdl")
public class Policy_Service
    extends Service
{

    private final static URL POLICY_WSDL_LOCATION;
    private final static WebServiceException POLICY_EXCEPTION;
    private final static QName POLICY_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "Policy");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/IntelliJp/safedata/src/main/java/safedata/view-source_safedata1.r1soft.ro_9080_Policy2_wsdl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        POLICY_WSDL_LOCATION = url;
        POLICY_EXCEPTION = e;
    }


    public Policy_Service() {
        super(__getWsdlLocation(), POLICY_QNAME);
    }

    public Policy_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), POLICY_QNAME, features);
    }

    public Policy_Service(URL wsdlLocation) {
        super(wsdlLocation, POLICY_QNAME);
    }

    public Policy_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, POLICY_QNAME, features);
    }

    public Policy_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Policy_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PolicyService
     */
    @WebEndpoint(name = "PolicyServiceImplPort")
    public PolicyService getPolicyServiceImplPort() {
        return super.getPort(new QName("http://policy.apiV2.server.backup.r1soft.com/", "PolicyServiceImplPort"), PolicyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PolicyService
     */
    @WebEndpoint(name = "PolicyServiceImplPort")
    public PolicyService getPolicyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://policy.apiV2.server.backup.r1soft.com/", "PolicyServiceImplPort"), PolicyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (POLICY_EXCEPTION!= null) {
            throw POLICY_EXCEPTION;
        }
        return POLICY_WSDL_LOCATION;
    }

}
