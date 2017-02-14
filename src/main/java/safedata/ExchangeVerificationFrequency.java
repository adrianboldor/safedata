
package safedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exchangeVerificationFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="exchangeVerificationFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEVER_VERIFY"/>
 *     &lt;enumeration value="ALWAYS_VERIFY"/>
 *     &lt;enumeration value="AFTER_EVERY_X_SUCCESSFUL_BACKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "exchangeVerificationFrequency")
@XmlEnum
public enum ExchangeVerificationFrequency {

    NEVER_VERIFY,
    ALWAYS_VERIFY,
    AFTER_EVERY_X_SUCCESSFUL_BACKUP;

    public String value() {
        return name();
    }

    public static ExchangeVerificationFrequency fromValue(String v) {
        return valueOf(v);
    }

}
