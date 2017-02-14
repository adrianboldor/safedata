
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPolicyByDiskSafe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPolicyByDiskSafe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disksafe" type="{http://policy.apiV2.server.backup.r1soft.com/}diskSafe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPolicyByDiskSafe", propOrder = {
    "disksafe"
})
public class GetPolicyByDiskSafe {

    protected DiskSafe disksafe;

    /**
     * Gets the value of the disksafe property.
     * 
     * @return
     *     possible object is
     *     {@link DiskSafe }
     *     
     */
    public DiskSafe getDisksafe() {
        return disksafe;
    }

    /**
     * Sets the value of the disksafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskSafe }
     *     
     */
    public void setDisksafe(DiskSafe value) {
        this.disksafe = value;
    }

}
