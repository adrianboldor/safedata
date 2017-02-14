
package safedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taskExecutionContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskExecutionContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runningStatusKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runningStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskState" type="{http://policy.apiV2.server.backup.r1soft.com/}taskState" minOccurs="0"/>
 *         &lt;element name="taskType" type="{http://policy.apiV2.server.backup.r1soft.com/}taskType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskExecutionContext", propOrder = {
    "agentId",
    "completionTime",
    "executionTime",
    "id",
    "runningStatusKey",
    "runningStatusMessage",
    "scheduledTime",
    "taskInstanceId",
    "taskState",
    "taskType"
})
public class TaskExecutionContext {

    protected String agentId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionTime;
    protected String id;
    protected String runningStatusKey;
    protected String runningStatusMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    protected String taskInstanceId;
    @XmlSchemaType(name = "string")
    protected TaskState taskState;
    @XmlSchemaType(name = "string")
    protected TaskType taskType;

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionTime(XMLGregorianCalendar value) {
        this.completionTime = value;
    }

    /**
     * Gets the value of the executionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionTime() {
        return executionTime;
    }

    /**
     * Sets the value of the executionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionTime(XMLGregorianCalendar value) {
        this.executionTime = value;
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
     * Gets the value of the runningStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningStatusKey() {
        return runningStatusKey;
    }

    /**
     * Sets the value of the runningStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningStatusKey(String value) {
        this.runningStatusKey = value;
    }

    /**
     * Gets the value of the runningStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningStatusMessage() {
        return runningStatusMessage;
    }

    /**
     * Sets the value of the runningStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningStatusMessage(String value) {
        this.runningStatusMessage = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the taskInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstanceId() {
        return taskInstanceId;
    }

    /**
     * Sets the value of the taskInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstanceId(String value) {
        this.taskInstanceId = value;
    }

    /**
     * Gets the value of the taskState property.
     * 
     * @return
     *     possible object is
     *     {@link TaskState }
     *     
     */
    public TaskState getTaskState() {
        return taskState;
    }

    /**
     * Sets the value of the taskState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskState }
     *     
     */
    public void setTaskState(TaskState value) {
        this.taskState = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTaskType(TaskType value) {
        this.taskType = value;
    }

}
