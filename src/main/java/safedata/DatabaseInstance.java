
package safedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for databaseInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="databaseInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}options" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="dataBaseType" type="{http://policy.apiV2.server.backup.r1soft.com/}dataBaseType" minOccurs="0"/>
 *         &lt;element name="dataDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="useAlternateDataDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useAlternateHostname" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useAlternateInstallDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtuozzoContainerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "databaseInstance", propOrder = {
    "advancedOptions",
    "dataBaseType",
    "dataDirectory",
    "enabled",
    "hostName",
    "installDirectory",
    "name",
    "password",
    "portNumber",
    "useAlternateDataDirectory",
    "useAlternateHostname",
    "useAlternateInstallDirectory",
    "username",
    "virtuozzoContainerID"
})
public class DatabaseInstance {

    @XmlElement(required = true)
    protected DatabaseInstance.AdvancedOptions advancedOptions;
    @XmlSchemaType(name = "string")
    protected DataBaseType dataBaseType;
    protected String dataDirectory;
    protected Boolean enabled;
    protected String hostName;
    protected String installDirectory;
    protected String name;
    protected String password;
    protected Integer portNumber;
    protected Boolean useAlternateDataDirectory;
    protected Boolean useAlternateHostname;
    protected Boolean useAlternateInstallDirectory;
    protected String username;
    protected Integer virtuozzoContainerID;

    /**
     * Gets the value of the advancedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseInstance.AdvancedOptions }
     *     
     */
    public DatabaseInstance.AdvancedOptions getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * Sets the value of the advancedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseInstance.AdvancedOptions }
     *     
     */
    public void setAdvancedOptions(DatabaseInstance.AdvancedOptions value) {
        this.advancedOptions = value;
    }

    /**
     * Gets the value of the dataBaseType property.
     * 
     * @return
     *     possible object is
     *     {@link DataBaseType }
     *     
     */
    public DataBaseType getDataBaseType() {
        return dataBaseType;
    }

    /**
     * Sets the value of the dataBaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBaseType }
     *     
     */
    public void setDataBaseType(DataBaseType value) {
        this.dataBaseType = value;
    }

    /**
     * Gets the value of the dataDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDirectory() {
        return dataDirectory;
    }

    /**
     * Sets the value of the dataDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDirectory(String value) {
        this.dataDirectory = value;
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
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the installDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallDirectory() {
        return installDirectory;
    }

    /**
     * Sets the value of the installDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallDirectory(String value) {
        this.installDirectory = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortNumber(Integer value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the useAlternateDataDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAlternateDataDirectory() {
        return useAlternateDataDirectory;
    }

    /**
     * Sets the value of the useAlternateDataDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAlternateDataDirectory(Boolean value) {
        this.useAlternateDataDirectory = value;
    }

    /**
     * Gets the value of the useAlternateHostname property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAlternateHostname() {
        return useAlternateHostname;
    }

    /**
     * Sets the value of the useAlternateHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAlternateHostname(Boolean value) {
        this.useAlternateHostname = value;
    }

    /**
     * Gets the value of the useAlternateInstallDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAlternateInstallDirectory() {
        return useAlternateInstallDirectory;
    }

    /**
     * Sets the value of the useAlternateInstallDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAlternateInstallDirectory(Boolean value) {
        this.useAlternateInstallDirectory = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the virtuozzoContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVirtuozzoContainerID() {
        return virtuozzoContainerID;
    }

    /**
     * Sets the value of the virtuozzoContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVirtuozzoContainerID(Integer value) {
        this.virtuozzoContainerID = value;
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
     *                   &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}options" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    public static class AdvancedOptions {

        protected List<DatabaseInstance.AdvancedOptions.Entry> entry;

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
         * {@link DatabaseInstance.AdvancedOptions.Entry }
         * 
         * 
         */
        public List<DatabaseInstance.AdvancedOptions.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DatabaseInstance.AdvancedOptions.Entry>();
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
         *         &lt;element name="key" type="{http://policy.apiV2.server.backup.r1soft.com/}options" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            protected Options key;
            protected Boolean value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link Options }
             *     
             */
            public Options getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link Options }
             *     
             */
            public void setKey(Options value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setValue(Boolean value) {
                this.value = value;
            }

        }

    }

}
