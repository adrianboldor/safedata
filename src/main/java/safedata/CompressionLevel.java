
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compressionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compressionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "compressionLevel")
@XmlEnum
public enum CompressionLevel {

    LOW,
    MEDIUM,
    HIGH;

    public String value() {
        return name();
    }

    public static CompressionLevel fromValue(String v) {
        return valueOf(v);
    }

}
