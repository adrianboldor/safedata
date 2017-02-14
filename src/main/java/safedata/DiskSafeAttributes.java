
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diskSafeAttributes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="diskSafeAttributes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FILE_EXCLUDES_ENABLED"/>
 *     &lt;enumeration value="REPLICATION_FREQUENCY_LIMIT"/>
 *     &lt;enumeration value="ARCHIVING_ENABLED"/>
 *     &lt;enumeration value="CONTROLPANELS_ENABLED"/>
 *     &lt;enumeration value="RECOVERY_POINT_LIMIT"/>
 *     &lt;enumeration value="ARCHIVE_POINT_LIMIT"/>
 *     &lt;enumeration value="QUOTA_TYPE"/>
 *     &lt;enumeration value="SOFT_QUOTA_VALUE"/>
 *     &lt;enumeration value="HARD_QUOTA_VALUE"/>
 *     &lt;enumeration value="DATABASE_BACKUPS_ENABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "diskSafeAttributes")
@XmlEnum
public enum DiskSafeAttributes {

    FILE_EXCLUDES_ENABLED,
    REPLICATION_FREQUENCY_LIMIT,
    ARCHIVING_ENABLED,
    CONTROLPANELS_ENABLED,
    RECOVERY_POINT_LIMIT,
    ARCHIVE_POINT_LIMIT,
    QUOTA_TYPE,
    SOFT_QUOTA_VALUE,
    HARD_QUOTA_VALUE,
    DATABASE_BACKUPS_ENABLED;

    public String value() {
        return name();
    }

    public static DiskSafeAttributes fromValue(String v) {
        return valueOf(v);
    }

}
