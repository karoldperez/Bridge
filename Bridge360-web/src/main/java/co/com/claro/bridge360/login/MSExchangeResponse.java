package co.com.claro.qdn.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author acastanv
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSExchangeResponse", propOrder
        = {"isValid",
            "message"})
public class MSExchangeResponse {

    @XmlElement(name = "message", required = false)
    private String message;

    @XmlElement(name = "isValid", required = false)
    private String isValid;

    /**
     *
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return String
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     *
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "ClassPojo [message = " + message + ", isValid = " + isValid + "]";
    }
}
