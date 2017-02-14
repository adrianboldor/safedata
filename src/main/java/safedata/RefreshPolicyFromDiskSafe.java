
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refreshPolicyFromDiskSafe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refreshPolicyFromDiskSafe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diskSafeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refreshPolicyFromDiskSafe", propOrder = {
    "diskSafeID"
})
public class RefreshPolicyFromDiskSafe {

    protected String diskSafeID;

    /**
     * Gets the value of the diskSafeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskSafeID() {
        return diskSafeID;
    }

    /**
     * Sets the value of the diskSafeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskSafeID(String value) {
        this.diskSafeID = value;
    }

}
