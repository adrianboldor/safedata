
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA_PROTECTION_POLICY"/>
 *     &lt;enumeration value="FILE_RESTORE"/>
 *     &lt;enumeration value="MERGE_RECOVERY_POINTS"/>
 *     &lt;enumeration value="VACUUM"/>
 *     &lt;enumeration value="DATABASE_RESTORE"/>
 *     &lt;enumeration value="EXCHANGE_RESTORE"/>
 *     &lt;enumeration value="BARE_METAL_RESTORE"/>
 *     &lt;enumeration value="EMAIL_REPORT"/>
 *     &lt;enumeration value="ARCHIVE"/>
 *     &lt;enumeration value="DELETE_ARCHIVE_POINTS"/>
 *     &lt;enumeration value="RESTORE_CONTROL_PANEL_USER_DATA"/>
 *     &lt;enumeration value="TASK_HISTORY_CLEANUP"/>
 *     &lt;enumeration value="DISK_SAFE_VERIFICATION"/>
 *     &lt;enumeration value="REMOTE_AGENT_DEPLOYMENT"/>
 *     &lt;enumeration value="DISK_SAFE_REPLICATION"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="TASK_HISTORY_IMPORT"/>
 *     &lt;enumeration value="SEED_DRIVE_EXPORT"/>
 *     &lt;enumeration value="RECOVERY_DRIVE_IMPORT"/>
 *     &lt;enumeration value="DISK_SAFE_EXPORT"/>
 *     &lt;enumeration value="COPY_DISK_SAFE"/>
 *     &lt;enumeration value="GET_AGENT_LOGS"/>
 *     &lt;enumeration value="EXPORT_TO_OVA"/>
 *     &lt;enumeration value="THROTTLE_DATA_TRANSFER"/>
 *     &lt;enumeration value="RECOVERY_DRIVE_WIPE"/>
 *     &lt;enumeration value="COMPACTION"/>
 *     &lt;enumeration value="BLANK_DISK_SAFE_TASK"/>
 *     &lt;enumeration value="REMOTE_REPLICATION_RECEIVE_TASK"/>
 *     &lt;enumeration value="REMOTE_REPLICATION_SEND_TASK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskType")
@XmlEnum
public enum TaskType {

    DATA_PROTECTION_POLICY,
    FILE_RESTORE,
    MERGE_RECOVERY_POINTS,
    VACUUM,
    DATABASE_RESTORE,
    EXCHANGE_RESTORE,
    BARE_METAL_RESTORE,
    EMAIL_REPORT,
    ARCHIVE,
    DELETE_ARCHIVE_POINTS,
    RESTORE_CONTROL_PANEL_USER_DATA,
    TASK_HISTORY_CLEANUP,
    DISK_SAFE_VERIFICATION,
    REMOTE_AGENT_DEPLOYMENT,
    DISK_SAFE_REPLICATION,
    SYSTEM,
    TASK_HISTORY_IMPORT,
    SEED_DRIVE_EXPORT,
    RECOVERY_DRIVE_IMPORT,
    DISK_SAFE_EXPORT,
    COPY_DISK_SAFE,
    GET_AGENT_LOGS,
    EXPORT_TO_OVA,
    THROTTLE_DATA_TRANSFER,
    RECOVERY_DRIVE_WIPE,
    COMPACTION,
    BLANK_DISK_SAFE_TASK,
    REMOTE_REPLICATION_RECEIVE_TASK,
    REMOTE_REPLICATION_SEND_TASK;

    public String value() {
        return name();
    }

    public static TaskType fromValue(String v) {
        return valueOf(v);
    }

}
