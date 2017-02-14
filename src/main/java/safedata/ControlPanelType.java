
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlPanelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlPanelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPANEL"/>
 *     &lt;enumeration value="PLESK"/>
 *     &lt;enumeration value="VIRTUOZZO"/>
 *     &lt;enumeration value="PARALLELSPRO"/>
 *     &lt;enumeration value="INTERWORX"/>
 *     &lt;enumeration value="DIRECTADMIN"/>
 *     &lt;enumeration value="PARALLELS_H_SPHERE"/>
 *     &lt;enumeration value="LINUX"/>
 *     &lt;enumeration value="CUSTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlPanelType")
@XmlEnum
public enum ControlPanelType {

    CPANEL,
    PLESK,
    VIRTUOZZO,
    PARALLELSPRO,
    INTERWORX,
    DIRECTADMIN,
    PARALLELS_H_SPHERE,
    LINUX,
    CUSTOM;

    public String value() {
        return name();
    }

    public static ControlPanelType fromValue(String v) {
        return valueOf(v);
    }

}
