
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exchangeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exchangeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchangeFrequencyValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="exchangeVerificationFrequency" type="{http://policy.apiV2.server.backup.r1soft.com/}exchangeVerificationFrequency" minOccurs="0"/>
 *         &lt;element name="protectALLInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exchangeSettings", propOrder = {
    "exchangeFrequencyValue",
    "exchangeVerificationFrequency",
    "protectALLInstances"
})
public class ExchangeSettings {

    protected Integer exchangeFrequencyValue;
    @XmlSchemaType(name = "string")
    protected ExchangeVerificationFrequency exchangeVerificationFrequency;
    protected Boolean protectALLInstances;

    /**
     * Gets the value of the exchangeFrequencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExchangeFrequencyValue() {
        return exchangeFrequencyValue;
    }

    /**
     * Sets the value of the exchangeFrequencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExchangeFrequencyValue(Integer value) {
        this.exchangeFrequencyValue = value;
    }

    /**
     * Gets the value of the exchangeVerificationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeVerificationFrequency }
     *     
     */
    public ExchangeVerificationFrequency getExchangeVerificationFrequency() {
        return exchangeVerificationFrequency;
    }

    /**
     * Sets the value of the exchangeVerificationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeVerificationFrequency }
     *     
     */
    public void setExchangeVerificationFrequency(ExchangeVerificationFrequency value) {
        this.exchangeVerificationFrequency = value;
    }

    /**
     * Gets the value of the protectALLInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtectALLInstances() {
        return protectALLInstances;
    }

    /**
     * Sets the value of the protectALLInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectALLInstances(Boolean value) {
        this.protectALLInstances = value;
    }

}
