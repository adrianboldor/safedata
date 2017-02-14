
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for archiveScheduleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="archiveScheduleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOURLY"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "archiveScheduleType")
@XmlEnum
public enum ArchiveScheduleType {

    HOURLY,
    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY;

    public String value() {
        return name();
    }

    public static ArchiveScheduleType fromValue(String v) {
        return valueOf(v);
    }

}
