
package safedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diskSafe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diskSafe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazonGlacierAccessKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazonGlacierEndPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazonGlacierSecretKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazonGlacierVault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupPartitionTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backupUnmountedDevices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bytesOnDisk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="compressionLevel" type="{http://policy.apiV2.server.backup.r1soft.com/}compressionLevel" minOccurs="0"/>
 *         &lt;element name="compressionType" type="{http://policy.apiV2.server.backup.r1soft.com/}compressionType" minOccurs="0"/>
 *         &lt;element name="deltasInDiskSafe" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceBackupType" type="{http://policy.apiV2.server.backup.r1soft.com/}deviceBackupType" minOccurs="0"/>
 *         &lt;element name="deviceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deviceList" type="{http://policy.apiV2.server.backup.r1soft.com/}device" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diskSafeAttributeMap">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}diskSafeAttributes" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="diskSafeEncryptionPassphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diskSafeEncryptionType" type="{http://policy.apiV2.server.backup.r1soft.com/}diskSafeEncryptionType" minOccurs="0"/>
 *         &lt;element name="hasAvailableRecoveryPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushEncryptionKeyToAgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recoveryPointCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="replicationAction" type="{http://policy.apiV2.server.backup.r1soft.com/}replicationAction" minOccurs="0"/>
 *         &lt;element name="replicationCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replicationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="replicationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sizeOfDeltasInDiskSafe" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalFreePages" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalFreePagesBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalPageBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalPageCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="volumeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diskSafe", propOrder = {
    "agentID",
    "amazonGlacierAccessKey",
    "amazonGlacierEndPoint",
    "amazonGlacierSecretKey",
    "amazonGlacierVault",
    "backupPartitionTable",
    "backupUnmountedDevices",
    "bytesOnDisk",
    "compressionLevel",
    "compressionType",
    "deltasInDiskSafe",
    "description",
    "deviceBackupType",
    "deviceCount",
    "deviceList",
    "diskSafeAttributeMap",
    "diskSafeEncryptionPassphrase",
    "diskSafeEncryptionType",
    "hasAvailableRecoveryPoint",
    "id",
    "open",
    "path",
    "pushEncryptionKeyToAgent",
    "recoveryPointCount",
    "replicationAction",
    "replicationCommand",
    "replicationEnabled",
    "replicationPath",
    "size",
    "sizeOfDeltasInDiskSafe",
    "totalFreePages",
    "totalFreePagesBytes",
    "totalPageBytes",
    "totalPageCount",
    "volumeID"
})
public class DiskSafe {

    protected String agentID;
    protected String amazonGlacierAccessKey;
    protected String amazonGlacierEndPoint;
    protected String amazonGlacierSecretKey;
    protected String amazonGlacierVault;
    protected Boolean backupPartitionTable;
    protected Boolean backupUnmountedDevices;
    protected Long bytesOnDisk;
    @XmlSchemaType(name = "string")
    protected CompressionLevel compressionLevel;
    @XmlSchemaType(name = "string")
    protected CompressionType compressionType;
    protected Long deltasInDiskSafe;
    protected String description;
    @XmlSchemaType(name = "string")
    protected DeviceBackupType deviceBackupType;
    protected Integer deviceCount;
    @XmlElement(nillable = true)
    protected List<Device> deviceList;
    @XmlElement(required = true)
    protected DiskSafe.DiskSafeAttributeMap diskSafeAttributeMap;
    protected String diskSafeEncryptionPassphrase;
    @XmlSchemaType(name = "string")
    protected DiskSafeEncryptionType diskSafeEncryptionType;
    protected Boolean hasAvailableRecoveryPoint;
    protected String id;
    protected Boolean open;
    protected String path;
    protected Boolean pushEncryptionKeyToAgent;
    protected Long recoveryPointCount;
    @XmlSchemaType(name = "string")
    protected ReplicationAction replicationAction;
    protected String replicationCommand;
    protected Boolean replicationEnabled;
    protected String replicationPath;
    protected Long size;
    protected Long sizeOfDeltasInDiskSafe;
    protected Long totalFreePages;
    protected Long totalFreePagesBytes;
    protected Long totalPageBytes;
    protected Long totalPageCount;
    protected String volumeID;

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the amazonGlacierAccessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonGlacierAccessKey() {
        return amazonGlacierAccessKey;
    }

    /**
     * Sets the value of the amazonGlacierAccessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonGlacierAccessKey(String value) {
        this.amazonGlacierAccessKey = value;
    }

    /**
     * Gets the value of the amazonGlacierEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonGlacierEndPoint() {
        return amazonGlacierEndPoint;
    }

    /**
     * Sets the value of the amazonGlacierEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonGlacierEndPoint(String value) {
        this.amazonGlacierEndPoint = value;
    }

    /**
     * Gets the value of the amazonGlacierSecretKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonGlacierSecretKey() {
        return amazonGlacierSecretKey;
    }

    /**
     * Sets the value of the amazonGlacierSecretKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonGlacierSecretKey(String value) {
        this.amazonGlacierSecretKey = value;
    }

    /**
     * Gets the value of the amazonGlacierVault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonGlacierVault() {
        return amazonGlacierVault;
    }

    /**
     * Sets the value of the amazonGlacierVault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonGlacierVault(String value) {
        this.amazonGlacierVault = value;
    }

    /**
     * Gets the value of the backupPartitionTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackupPartitionTable() {
        return backupPartitionTable;
    }

    /**
     * Sets the value of the backupPartitionTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackupPartitionTable(Boolean value) {
        this.backupPartitionTable = value;
    }

    /**
     * Gets the value of the backupUnmountedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackupUnmountedDevices() {
        return backupUnmountedDevices;
    }

    /**
     * Sets the value of the backupUnmountedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackupUnmountedDevices(Boolean value) {
        this.backupUnmountedDevices = value;
    }

    /**
     * Gets the value of the bytesOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBytesOnDisk() {
        return bytesOnDisk;
    }

    /**
     * Sets the value of the bytesOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBytesOnDisk(Long value) {
        this.bytesOnDisk = value;
    }

    /**
     * Gets the value of the compressionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionLevel }
     *     
     */
    public CompressionLevel getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Sets the value of the compressionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionLevel }
     *     
     */
    public void setCompressionLevel(CompressionLevel value) {
        this.compressionLevel = value;
    }

    /**
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionType }
     *     
     */
    public CompressionType getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionType }
     *     
     */
    public void setCompressionType(CompressionType value) {
        this.compressionType = value;
    }

    /**
     * Gets the value of the deltasInDiskSafe property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeltasInDiskSafe() {
        return deltasInDiskSafe;
    }

    /**
     * Sets the value of the deltasInDiskSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeltasInDiskSafe(Long value) {
        this.deltasInDiskSafe = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the deviceBackupType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceBackupType }
     *     
     */
    public DeviceBackupType getDeviceBackupType() {
        return deviceBackupType;
    }

    /**
     * Sets the value of the deviceBackupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceBackupType }
     *     
     */
    public void setDeviceBackupType(DeviceBackupType value) {
        this.deviceBackupType = value;
    }

    /**
     * Gets the value of the deviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceCount() {
        return deviceCount;
    }

    /**
     * Sets the value of the deviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceCount(Integer value) {
        this.deviceCount = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Device }
     * 
     * 
     */
    public List<Device> getDeviceList() {
        if (deviceList == null) {
            deviceList = new ArrayList<Device>();
        }
        return this.deviceList;
    }

    /**
     * Gets the value of the diskSafeAttributeMap property.
     * 
     * @return
     *     possible object is
     *     {@link DiskSafe.DiskSafeAttributeMap }
     *     
     */
    public DiskSafe.DiskSafeAttributeMap getDiskSafeAttributeMap() {
        return diskSafeAttributeMap;
    }

    /**
     * Sets the value of the diskSafeAttributeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskSafe.DiskSafeAttributeMap }
     *     
     */
    public void setDiskSafeAttributeMap(DiskSafe.DiskSafeAttributeMap value) {
        this.diskSafeAttributeMap = value;
    }

    /**
     * Gets the value of the diskSafeEncryptionPassphrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskSafeEncryptionPassphrase() {
        return diskSafeEncryptionPassphrase;
    }

    /**
     * Sets the value of the diskSafeEncryptionPassphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskSafeEncryptionPassphrase(String value) {
        this.diskSafeEncryptionPassphrase = value;
    }

    /**
     * Gets the value of the diskSafeEncryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link DiskSafeEncryptionType }
     *     
     */
    public DiskSafeEncryptionType getDiskSafeEncryptionType() {
        return diskSafeEncryptionType;
    }

    /**
     * Sets the value of the diskSafeEncryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskSafeEncryptionType }
     *     
     */
    public void setDiskSafeEncryptionType(DiskSafeEncryptionType value) {
        this.diskSafeEncryptionType = value;
    }

    /**
     * Gets the value of the hasAvailableRecoveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAvailableRecoveryPoint() {
        return hasAvailableRecoveryPoint;
    }

    /**
     * Sets the value of the hasAvailableRecoveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAvailableRecoveryPoint(Boolean value) {
        this.hasAvailableRecoveryPoint = value;
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
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the pushEncryptionKeyToAgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPushEncryptionKeyToAgent() {
        return pushEncryptionKeyToAgent;
    }

    /**
     * Sets the value of the pushEncryptionKeyToAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPushEncryptionKeyToAgent(Boolean value) {
        this.pushEncryptionKeyToAgent = value;
    }

    /**
     * Gets the value of the recoveryPointCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecoveryPointCount() {
        return recoveryPointCount;
    }

    /**
     * Sets the value of the recoveryPointCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecoveryPointCount(Long value) {
        this.recoveryPointCount = value;
    }

    /**
     * Gets the value of the replicationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationAction }
     *     
     */
    public ReplicationAction getReplicationAction() {
        return replicationAction;
    }

    /**
     * Sets the value of the replicationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationAction }
     *     
     */
    public void setReplicationAction(ReplicationAction value) {
        this.replicationAction = value;
    }

    /**
     * Gets the value of the replicationCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplicationCommand() {
        return replicationCommand;
    }

    /**
     * Sets the value of the replicationCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplicationCommand(String value) {
        this.replicationCommand = value;
    }

    /**
     * Gets the value of the replicationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicationEnabled() {
        return replicationEnabled;
    }

    /**
     * Sets the value of the replicationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicationEnabled(Boolean value) {
        this.replicationEnabled = value;
    }

    /**
     * Gets the value of the replicationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplicationPath() {
        return replicationPath;
    }

    /**
     * Sets the value of the replicationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplicationPath(String value) {
        this.replicationPath = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizeOfDeltasInDiskSafe property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSizeOfDeltasInDiskSafe() {
        return sizeOfDeltasInDiskSafe;
    }

    /**
     * Sets the value of the sizeOfDeltasInDiskSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSizeOfDeltasInDiskSafe(Long value) {
        this.sizeOfDeltasInDiskSafe = value;
    }

    /**
     * Gets the value of the totalFreePages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalFreePages() {
        return totalFreePages;
    }

    /**
     * Sets the value of the totalFreePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalFreePages(Long value) {
        this.totalFreePages = value;
    }

    /**
     * Gets the value of the totalFreePagesBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalFreePagesBytes() {
        return totalFreePagesBytes;
    }

    /**
     * Sets the value of the totalFreePagesBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalFreePagesBytes(Long value) {
        this.totalFreePagesBytes = value;
    }

    /**
     * Gets the value of the totalPageBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPageBytes() {
        return totalPageBytes;
    }

    /**
     * Sets the value of the totalPageBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPageBytes(Long value) {
        this.totalPageBytes = value;
    }

    /**
     * Gets the value of the totalPageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * Sets the value of the totalPageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPageCount(Long value) {
        this.totalPageCount = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeID(String value) {
        this.volumeID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}diskSafeAttributes" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class DiskSafeAttributeMap {

        protected List<DiskSafe.DiskSafeAttributeMap.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiskSafe.DiskSafeAttributeMap.Entry }
         * 
         * 
         */
        public List<DiskSafe.DiskSafeAttributeMap.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DiskSafe.DiskSafeAttributeMap.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}diskSafeAttributes" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            @XmlSchemaType(name = "string")
            protected DiskSafeAttributes key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link DiskSafeAttributes }
             *     
             */
            public DiskSafeAttributes getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiskSafeAttributes }
             *     
             */
            public void setKey(DiskSafeAttributes value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
