//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.03 at 06:12:21 PM EDT 
//


package edu.umd.cs.guitar.model.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IgnoredComponents" type="{}ComponentListType"/>
 *         &lt;element name="TerminalComponents" type="{}ComponentListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ignoredComponents",
    "terminalComponents"
})
@XmlRootElement(name = "Configuration")
public class Configuration {

    @XmlElement(name = "IgnoredComponents", required = true)
    protected ComponentListType ignoredComponents;
    @XmlElement(name = "TerminalComponents", required = true)
    protected ComponentListType terminalComponents;

    /**
     * Gets the value of the ignoredComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentListType }
     *     
     */
    public ComponentListType getIgnoredComponents() {
        return ignoredComponents;
    }

    /**
     * Sets the value of the ignoredComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentListType }
     *     
     */
    public void setIgnoredComponents(ComponentListType value) {
        this.ignoredComponents = value;
    }

    /**
     * Gets the value of the terminalComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentListType }
     *     
     */
    public ComponentListType getTerminalComponents() {
        return terminalComponents;
    }

    /**
     * Sets the value of the terminalComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentListType }
     *     
     */
    public void setTerminalComponents(ComponentListType value) {
        this.terminalComponents = value;
    }

}
