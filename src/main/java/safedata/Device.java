
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocatedBlocks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mountPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mounted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalBlocks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device", propOrder = {
    "allocatedBlocks",
    "blockSize",
    "capacity",
    "contentID",
    "deviceContentType",
    "devicePath",
    "enabled",
    "mountPoint",
    "mounted",
    "serialNumber",
    "totalBlocks"
})
public class Device {

    protected Long allocatedBlocks;
    protected Integer blockSize;
    protected Long capacity;
    protected String contentID;
    protected String deviceContentType;
    protected String devicePath;
    protected Boolean enabled;
    protected String mountPoint;
    protected Boolean mounted;
    protected String serialNumber;
    protected Long totalBlocks;

    /**
     * Gets the value of the allocatedBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllocatedBlocks() {
        return allocatedBlocks;
    }

    /**
     * Sets the value of the allocatedBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllocatedBlocks(Long value) {
        this.allocatedBlocks = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockSize(Integer value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacity(Long value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the deviceContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceContentType() {
        return deviceContentType;
    }

    /**
     * Sets the value of the deviceContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceContentType(String value) {
        this.deviceContentType = value;
    }

    /**
     * Gets the value of the devicePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePath() {
        return devicePath;
    }

    /**
     * Sets the value of the devicePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePath(String value) {
        this.devicePath = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the mountPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * Sets the value of the mountPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountPoint(String value) {
        this.mountPoint = value;
    }

    /**
     * Gets the value of the mounted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMounted() {
        return mounted;
    }

    /**
     * Sets the value of the mounted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMounted(Boolean value) {
        this.mounted = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the totalBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalBlocks() {
        return totalBlocks;
    }

    /**
     * Sets the value of the totalBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalBlocks(Long value) {
        this.totalBlocks = value;
    }

}
