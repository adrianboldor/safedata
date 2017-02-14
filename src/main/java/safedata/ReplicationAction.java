
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="replicationAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="EXECUTE_SCRIPT"/>
 *     &lt;enumeration value="AMAZON_GLACIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "replicationAction")
@XmlEnum
public enum ReplicationAction {

    NONE,
    EXECUTE_SCRIPT,
    AMAZON_GLACIER;

    public String value() {
        return name();
    }

    public static ReplicationAction fromValue(String v) {
        return valueOf(v);
    }

}
