
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileExclusionProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileExclusionProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exclusionPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRecursive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileExclusionProperty", propOrder = {
    "exclusionPattern",
    "isRecursive"
})
public class FileExclusionProperty {

    protected String exclusionPattern;
    protected Boolean isRecursive;

    /**
     * Gets the value of the exclusionPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionPattern() {
        return exclusionPattern;
    }

    /**
     * Sets the value of the exclusionPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionPattern(String value) {
        this.exclusionPattern = value;
    }

    /**
     * Gets the value of the isRecursive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecursive() {
        return isRecursive;
    }

    /**
     * Sets the value of the isRecursive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecursive(Boolean value) {
        this.isRecursive = value;
    }

}
