
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compressionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ZLIB"/>
 *     &lt;enumeration value="QUICKLZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "compressionType")
@XmlEnum
public enum CompressionType {

    NONE,
    ZLIB,
    QUICKLZ;

    public String value() {
        return name();
    }

    public static CompressionType fromValue(String v) {
        return valueOf(v);
    }

}
