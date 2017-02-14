
package safedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archiveScheduleInstanceList" type="{http://policy.apiV2.server.backup.r1soft.com/}archiveScheduleInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="backingFileLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlPanelInstanceList" type="{http://policy.apiV2.server.backup.r1soft.com/}controlPanelInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="databaseInstanceList" type="{http://policy.apiV2.server.backup.r1soft.com/}databaseInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diskSafeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diskSafeVerificationScheduleFrequencyValues" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyValues" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exchangeSettings" type="{http://policy.apiV2.server.backup.r1soft.com/}exchangeSettings" minOccurs="0"/>
 *         &lt;element name="excludeList" type="{http://policy.apiV2.server.backup.r1soft.com/}fileExclusionProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forceFullBlockScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReplicationRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="localArchivingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="localRetentionSettings" type="{http://policy.apiV2.server.backup.r1soft.com/}retentionSettings" minOccurs="0"/>
 *         &lt;element name="mergeScheduleFrequencyType" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyType" minOccurs="0"/>
 *         &lt;element name="mergeScheduleFrequencyValues" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyValues" minOccurs="0"/>
 *         &lt;element name="multiVolumeSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextReplicationRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recoveryPointLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remoteRetentionSettings" type="{http://policy.apiV2.server.backup.r1soft.com/}retentionSettings" minOccurs="0"/>
 *         &lt;element name="replicateAfterArchiving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="replicationScheduleFrequencyType" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyType" minOccurs="0"/>
 *         &lt;element name="replicationScheduleFrequencyValues" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyValues" minOccurs="0"/>
 *         &lt;element name="SQLServerSettings" type="{http://policy.apiV2.server.backup.r1soft.com/}sqlServerSettings" minOccurs="0"/>
 *         &lt;element name="state" type="{http://policy.apiV2.server.backup.r1soft.com/}policyState" minOccurs="0"/>
 *         &lt;element name="warnings" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diskSafeVerificationScheduleFrequencyType" type="{http://policy.apiV2.server.backup.r1soft.com/}frequencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policy", propOrder = {
    "archiveScheduleInstanceList",
    "backingFileLocation",
    "controlPanelInstanceList",
    "databaseInstanceList",
    "description",
    "diskSafeID",
    "diskSafeVerificationScheduleFrequencyValues",
    "enabled",
    "errors",
    "exchangeSettings",
    "excludeList",
    "forceFullBlockScan",
    "id",
    "lastReplicationRunTime",
    "localArchivingEnabled",
    "localRetentionSettings",
    "mergeScheduleFrequencyType",
    "mergeScheduleFrequencyValues",
    "multiVolumeSnapshot",
    "name",
    "nextReplicationRunTime",
    "recoveryPointLimit",
    "remoteRetentionSettings",
    "replicateAfterArchiving",
    "replicationScheduleFrequencyType",
    "replicationScheduleFrequencyValues",
    "sqlServerSettings",
    "state",
    "warnings",
    "diskSafeVerificationScheduleFrequencyType"
})
public class Policy {

    @XmlElement(nillable = true)
    protected List<ArchiveScheduleInstance> archiveScheduleInstanceList;
    protected String backingFileLocation;
    @XmlElement(nillable = true)
    protected List<ControlPanelInstance> controlPanelInstanceList;
    @XmlElement(nillable = true)
    protected List<DatabaseInstance> databaseInstanceList;
    protected String description;
    protected String diskSafeID;
    protected FrequencyValues diskSafeVerificationScheduleFrequencyValues;
    protected Boolean enabled;
    @XmlElement(nillable = true)
    protected List<String> errors;
    protected ExchangeSettings exchangeSettings;
    @XmlElement(nillable = true)
    protected List<FileExclusionProperty> excludeList;
    protected Boolean forceFullBlockScan;
    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReplicationRunTime;
    protected Boolean localArchivingEnabled;
    protected RetentionSettings localRetentionSettings;
    @XmlSchemaType(name = "string")
    protected FrequencyType mergeScheduleFrequencyType;
    protected FrequencyValues mergeScheduleFrequencyValues;
    protected Boolean multiVolumeSnapshot;
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextReplicationRunTime;
    protected Integer recoveryPointLimit;
    protected RetentionSettings remoteRetentionSettings;
    protected Boolean replicateAfterArchiving;
    @XmlSchemaType(name = "string")
    protected FrequencyType replicationScheduleFrequencyType;
    protected FrequencyValues replicationScheduleFrequencyValues;
    @XmlElement(name = "SQLServerSettings")
    protected SqlServerSettings sqlServerSettings;
    @XmlSchemaType(name = "string")
    protected PolicyState state;
    @XmlElement(nillable = true)
    protected List<String> warnings;
    @XmlSchemaType(name = "string")
    protected FrequencyType diskSafeVerificationScheduleFrequencyType;

    /**
     * Gets the value of the archiveScheduleInstanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveScheduleInstanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveScheduleInstanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiveScheduleInstance }
     * 
     * 
     */
    public List<ArchiveScheduleInstance> getArchiveScheduleInstanceList() {
        if (archiveScheduleInstanceList == null) {
            archiveScheduleInstanceList = new ArrayList<ArchiveScheduleInstance>();
        }
        return this.archiveScheduleInstanceList;
    }

    /**
     * Gets the value of the backingFileLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingFileLocation() {
        return backingFileLocation;
    }

    /**
     * Sets the value of the backingFileLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingFileLocation(String value) {
        this.backingFileLocation = value;
    }

    /**
     * Gets the value of the controlPanelInstanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlPanelInstanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlPanelInstanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlPanelInstance }
     * 
     * 
     */
    public List<ControlPanelInstance> getControlPanelInstanceList() {
        if (controlPanelInstanceList == null) {
            controlPanelInstanceList = new ArrayList<ControlPanelInstance>();
        }
        return this.controlPanelInstanceList;
    }

    /**
     * Gets the value of the databaseInstanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseInstanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseInstanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseInstance }
     * 
     * 
     */
    public List<DatabaseInstance> getDatabaseInstanceList() {
        if (databaseInstanceList == null) {
            databaseInstanceList = new ArrayList<DatabaseInstance>();
        }
        return this.databaseInstanceList;
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

    /**
     * Gets the value of the diskSafeVerificationScheduleFrequencyValues property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyValues }
     *     
     */
    public FrequencyValues getDiskSafeVerificationScheduleFrequencyValues() {
        return diskSafeVerificationScheduleFrequencyValues;
    }

    /**
     * Sets the value of the diskSafeVerificationScheduleFrequencyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyValues }
     *     
     */
    public void setDiskSafeVerificationScheduleFrequencyValues(FrequencyValues value) {
        this.diskSafeVerificationScheduleFrequencyValues = value;
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
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrors() {
        if (errors == null) {
            errors = new ArrayList<String>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the exchangeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeSettings }
     *     
     */
    public ExchangeSettings getExchangeSettings() {
        return exchangeSettings;
    }

    /**
     * Sets the value of the exchangeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeSettings }
     *     
     */
    public void setExchangeSettings(ExchangeSettings value) {
        this.exchangeSettings = value;
    }

    /**
     * Gets the value of the excludeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileExclusionProperty }
     * 
     * 
     */
    public List<FileExclusionProperty> getExcludeList() {
        if (excludeList == null) {
            excludeList = new ArrayList<FileExclusionProperty>();
        }
        return this.excludeList;
    }

    /**
     * Gets the value of the forceFullBlockScan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceFullBlockScan() {
        return forceFullBlockScan;
    }

    /**
     * Sets the value of the forceFullBlockScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceFullBlockScan(Boolean value) {
        this.forceFullBlockScan = value;
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
     * Gets the value of the lastReplicationRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReplicationRunTime() {
        return lastReplicationRunTime;
    }

    /**
     * Sets the value of the lastReplicationRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReplicationRunTime(XMLGregorianCalendar value) {
        this.lastReplicationRunTime = value;
    }

    /**
     * Gets the value of the localArchivingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalArchivingEnabled() {
        return localArchivingEnabled;
    }

    /**
     * Sets the value of the localArchivingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalArchivingEnabled(Boolean value) {
        this.localArchivingEnabled = value;
    }

    /**
     * Gets the value of the localRetentionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionSettings }
     *     
     */
    public RetentionSettings getLocalRetentionSettings() {
        return localRetentionSettings;
    }

    /**
     * Sets the value of the localRetentionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionSettings }
     *     
     */
    public void setLocalRetentionSettings(RetentionSettings value) {
        this.localRetentionSettings = value;
    }

    /**
     * Gets the value of the mergeScheduleFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getMergeScheduleFrequencyType() {
        return mergeScheduleFrequencyType;
    }

    /**
     * Sets the value of the mergeScheduleFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setMergeScheduleFrequencyType(FrequencyType value) {
        this.mergeScheduleFrequencyType = value;
    }

    /**
     * Gets the value of the mergeScheduleFrequencyValues property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyValues }
     *     
     */
    public FrequencyValues getMergeScheduleFrequencyValues() {
        return mergeScheduleFrequencyValues;
    }

    /**
     * Sets the value of the mergeScheduleFrequencyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyValues }
     *     
     */
    public void setMergeScheduleFrequencyValues(FrequencyValues value) {
        this.mergeScheduleFrequencyValues = value;
    }

    /**
     * Gets the value of the multiVolumeSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiVolumeSnapshot() {
        return multiVolumeSnapshot;
    }

    /**
     * Sets the value of the multiVolumeSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiVolumeSnapshot(Boolean value) {
        this.multiVolumeSnapshot = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nextReplicationRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReplicationRunTime() {
        return nextReplicationRunTime;
    }

    /**
     * Sets the value of the nextReplicationRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReplicationRunTime(XMLGregorianCalendar value) {
        this.nextReplicationRunTime = value;
    }

    /**
     * Gets the value of the recoveryPointLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoveryPointLimit() {
        return recoveryPointLimit;
    }

    /**
     * Sets the value of the recoveryPointLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoveryPointLimit(Integer value) {
        this.recoveryPointLimit = value;
    }

    /**
     * Gets the value of the remoteRetentionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionSettings }
     *     
     */
    public RetentionSettings getRemoteRetentionSettings() {
        return remoteRetentionSettings;
    }

    /**
     * Sets the value of the remoteRetentionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionSettings }
     *     
     */
    public void setRemoteRetentionSettings(RetentionSettings value) {
        this.remoteRetentionSettings = value;
    }

    /**
     * Gets the value of the replicateAfterArchiving property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicateAfterArchiving() {
        return replicateAfterArchiving;
    }

    /**
     * Sets the value of the replicateAfterArchiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicateAfterArchiving(Boolean value) {
        this.replicateAfterArchiving = value;
    }

    /**
     * Gets the value of the replicationScheduleFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getReplicationScheduleFrequencyType() {
        return replicationScheduleFrequencyType;
    }

    /**
     * Sets the value of the replicationScheduleFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setReplicationScheduleFrequencyType(FrequencyType value) {
        this.replicationScheduleFrequencyType = value;
    }

    /**
     * Gets the value of the replicationScheduleFrequencyValues property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyValues }
     *     
     */
    public FrequencyValues getReplicationScheduleFrequencyValues() {
        return replicationScheduleFrequencyValues;
    }

    /**
     * Sets the value of the replicationScheduleFrequencyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyValues }
     *     
     */
    public void setReplicationScheduleFrequencyValues(FrequencyValues value) {
        this.replicationScheduleFrequencyValues = value;
    }

    /**
     * Gets the value of the sqlServerSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SqlServerSettings }
     *     
     */
    public SqlServerSettings getSQLServerSettings() {
        return sqlServerSettings;
    }

    /**
     * Sets the value of the sqlServerSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlServerSettings }
     *     
     */
    public void setSQLServerSettings(SqlServerSettings value) {
        this.sqlServerSettings = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyState }
     *     
     */
    public PolicyState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyState }
     *     
     */
    public void setState(PolicyState value) {
        this.state = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<String>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the diskSafeVerificationScheduleFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getDiskSafeVerificationScheduleFrequencyType() {
        return diskSafeVerificationScheduleFrequencyType;
    }

    /**
     * Sets the value of the diskSafeVerificationScheduleFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setDiskSafeVerificationScheduleFrequencyType(FrequencyType value) {
        this.diskSafeVerificationScheduleFrequencyType = value;
    }

}
