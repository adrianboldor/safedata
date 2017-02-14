
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for archiveScheduleInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archiveScheduleInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archiveScheduleFrequencyValues" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyValues" minOccurs="0"/>
 *         &lt;element name="archiveScheduleType" type="{http://policy.apiV2.server.backup.r1soft.com/}archiveScheduleType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replicate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="retentionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archiveScheduleInstance", propOrder = {
    "archiveScheduleFrequencyValues",
    "archiveScheduleType",
    "id",
    "replicate",
    "retentionCount"
})
public class ArchiveScheduleInstance {

    protected FrequencyValues archiveScheduleFrequencyValues;
    @XmlSchemaType(name = "string")
    protected ArchiveScheduleType archiveScheduleType;
    protected String id;
    protected Boolean replicate;
    protected Integer retentionCount;

    /**
     * Gets the value of the archiveScheduleFrequencyValues property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyValues }
     *     
     */
    public FrequencyValues getArchiveScheduleFrequencyValues() {
        return archiveScheduleFrequencyValues;
    }

    /**
     * Sets the value of the archiveScheduleFrequencyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyValues }
     *     
     */
    public void setArchiveScheduleFrequencyValues(FrequencyValues value) {
        this.archiveScheduleFrequencyValues = value;
    }

    /**
     * Gets the value of the archiveScheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveScheduleType }
     *     
     */
    public ArchiveScheduleType getArchiveScheduleType() {
        return archiveScheduleType;
    }

    /**
     * Sets the value of the archiveScheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveScheduleType }
     *     
     */
    public void setArchiveScheduleType(ArchiveScheduleType value) {
        this.archiveScheduleType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the replicate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicate() {
        return replicate;
    }

    /**
     * Sets the value of the replicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicate(Boolean value) {
        this.replicate = value;
    }

    /**
     * Gets the value of the retentionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetentionCount() {
        return retentionCount;
    }

    /**
     * Sets the value of the retentionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetentionCount(Integer value) {
        this.retentionCount = value;
    }

}
