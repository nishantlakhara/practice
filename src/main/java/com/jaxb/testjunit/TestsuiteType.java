//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.01 at 06:35:43 PM IST 
//


package com.jaxb.testjunit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testsuiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testsuiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testcase" type="{}testcaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="errors" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="skipped" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testsuiteType", propOrder = {
    "testcase"
})
public class TestsuiteType {

    protected List<TestcaseType> testcase;
    @XmlAttribute(name = "errors")
    protected Byte errors;
    @XmlAttribute(name = "skipped")
    protected Byte skipped;
    @XmlAttribute(name = "failures")
    protected Short failures;
    @XmlAttribute(name = "tests")
    protected Short tests;
    @XmlAttribute(name = "time")
    protected Float time;

    /**
     * Gets the value of the testcase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testcase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestcase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestcaseType }
     * 
     * 
     */
    public List<TestcaseType> getTestcase() {
        if (testcase == null) {
            testcase = new ArrayList<TestcaseType>();
        }
        return this.testcase;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setErrors(Byte value) {
        this.errors = value;
    }

    /**
     * Gets the value of the skipped property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSkipped() {
        return skipped;
    }

    /**
     * Sets the value of the skipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSkipped(Byte value) {
        this.skipped = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFailures() {
        return failures;
    }

    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFailures(Short value) {
        this.failures = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTests(Short value) {
        this.tests = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTime(Float value) {
        this.time = value;
    }

}