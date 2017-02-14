
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FINISHED"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="DUPLICATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskState")
@XmlEnum
public enum TaskState {

    FINISHED,
    RUNNING,
    QUEUED,
    CANCELLED,
    ERROR,
    DUPLICATE;

    public String value() {
        return name();
    }

    public static TaskState fromValue(String v) {
        return valueOf(v);
    }

}
