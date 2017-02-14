
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceBackupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceBackupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO_ADD_DEVICES"/>
 *     &lt;enumeration value="CHOOSE_DEVICES_TO_BACKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceBackupType")
@XmlEnum
public enum DeviceBackupType {

    AUTO_ADD_DEVICES,
    CHOOSE_DEVICES_TO_BACKUP;

    public String value() {
        return name();
    }

    public static DeviceBackupType fromValue(String v) {
        return valueOf(v);
    }

}
