
package safedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequencyValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="frequencyValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="daysOfWeek" type="{http://policy.apiV2.server.backup.r1soft.com/}daysOfWeek" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hoursOfDay" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minutelyValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monthsOfYear" type="{http://policy.apiV2.server.backup.r1soft.com/}monthsOfYear" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startingHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startingMinute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frequencyValues", propOrder = {
    "dayOfMonth",
    "daysOfMonth",
    "daysOfWeek",
    "hoursOfDay",
    "minutelyValue",
    "monthsOfYear",
    "startingHour",
    "startingMinute"
})
public class FrequencyValues {

    protected Integer dayOfMonth;
    @XmlElement(nillable = true)
    protected List<Integer> daysOfMonth;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<DaysOfWeek> daysOfWeek;
    @XmlElement(nillable = true)
    protected List<Integer> hoursOfDay;
    protected Integer minutelyValue;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<MonthsOfYear> monthsOfYear;
    protected Integer startingHour;
    protected Integer startingMinute;

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOfMonth(Integer value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the daysOfMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDaysOfMonth() {
        if (daysOfMonth == null) {
            daysOfMonth = new ArrayList<Integer>();
        }
        return this.daysOfMonth;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeek }
     * 
     * 
     */
    public List<DaysOfWeek> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DaysOfWeek>();
        }
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the hoursOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoursOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoursOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHoursOfDay() {
        if (hoursOfDay == null) {
            hoursOfDay = new ArrayList<Integer>();
        }
        return this.hoursOfDay;
    }

    /**
     * Gets the value of the minutelyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutelyValue() {
        return minutelyValue;
    }

    /**
     * Sets the value of the minutelyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutelyValue(Integer value) {
        this.minutelyValue = value;
    }

    /**
     * Gets the value of the monthsOfYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthsOfYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthsOfYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthsOfYear }
     * 
     * 
     */
    public List<MonthsOfYear> getMonthsOfYear() {
        if (monthsOfYear == null) {
            monthsOfYear = new ArrayList<MonthsOfYear>();
        }
        return this.monthsOfYear;
    }

    /**
     * Gets the value of the startingHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingHour() {
        return startingHour;
    }

    /**
     * Sets the value of the startingHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingHour(Integer value) {
        this.startingHour = value;
    }

    /**
     * Gets the value of the startingMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingMinute() {
        return startingMinute;
    }

    /**
     * Sets the value of the startingMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingMinute(Integer value) {
        this.startingMinute = value;
    }

}
