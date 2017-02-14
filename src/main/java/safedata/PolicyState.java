
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policyState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="ALERT"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyState")
@XmlEnum
public enum PolicyState {

    UNKNOWN,
    ERROR,
    ALERT,
    OK;

    public String value() {
        return name();
    }

    public static PolicyState fromValue(String v) {
        return valueOf(v);
    }

}
