
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diskSafeEncryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="diskSafeEncryptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="XTS_AES_256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "diskSafeEncryptionType")
@XmlEnum
public enum DiskSafeEncryptionType {

    NONE,
    XTS_AES_256;

    public String value() {
        return name();
    }

    public static DiskSafeEncryptionType fromValue(String v) {
        return valueOf(v);
    }

}
