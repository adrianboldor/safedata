
package safedata;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownObjectFault", targetNamespace = "http://policy.apiV2.server.backup.r1soft.com/")
public class UnknownObjectFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownObjectFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnknownObjectFault_Exception(String message, UnknownObjectFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnknownObjectFault_Exception(String message, UnknownObjectFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: safedata.UnknownObjectFault
     */
    public UnknownObjectFault getFaultInfo() {
        return faultInfo;
    }

}
