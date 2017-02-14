
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retentionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retentionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dailyLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hourlyLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monthlyLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="weeklyLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearlyLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retentionSettings", propOrder = {
    "dailyLimit",
    "hourlyLimit",
    "monthlyLimit",
    "weeklyLimit",
    "yearlyLimit"
})
public class RetentionSettings {

    protected Integer dailyLimit;
    protected Integer hourlyLimit;
    protected Integer monthlyLimit;
    protected Integer weeklyLimit;
    protected Integer yearlyLimit;

    /**
     * Gets the value of the dailyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyLimit() {
        return dailyLimit;
    }

    /**
     * Sets the value of the dailyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyLimit(Integer value) {
        this.dailyLimit = value;
    }

    /**
     * Gets the value of the hourlyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourlyLimit() {
        return hourlyLimit;
    }

    /**
     * Sets the value of the hourlyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourlyLimit(Integer value) {
        this.hourlyLimit = value;
    }

    /**
     * Gets the value of the monthlyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthlyLimit() {
        return monthlyLimit;
    }

    /**
     * Sets the value of the monthlyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthlyLimit(Integer value) {
        this.monthlyLimit = value;
    }

    /**
     * Gets the value of the weeklyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeklyLimit() {
        return weeklyLimit;
    }

    /**
     * Sets the value of the weeklyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeklyLimit(Integer value) {
        this.weeklyLimit = value;
    }

    /**
     * Gets the value of the yearlyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearlyLimit() {
        return yearlyLimit;
    }

    /**
     * Sets the value of the yearlyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearlyLimit(Integer value) {
        this.yearlyLimit = value;
    }

}
