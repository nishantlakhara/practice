//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.18 at 11:29:51 AM IST 
//


package com.jaxb.usecase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for use-casesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="use-casesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="use-case" type="{}use-caseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="use-cases")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "use-casesType", propOrder = {
    "useCase"
})
public class UseCasesType implements Cloneable {

    @XmlElement(name = "use-case")
    protected List<UseCaseType> useCase;

    @Override
    public Object clone() throws CloneNotSupportedException {
    	UseCasesType cloned = (UseCasesType)super.clone();
    	cloned.useCase = cloneList(this.getUseCase());
        return cloned;
    }
    
    public static List<UseCaseType> cloneList(List<UseCaseType> list) throws CloneNotSupportedException {
        List<UseCaseType> clone = new ArrayList<UseCaseType>(list.size());
        for(UseCaseType item: list) 
        	clone.add((UseCaseType)item.clone());
        return clone;
    }
    
    /**
     * Gets the value of the useCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseCaseType }
     * 
     * 
     */
    public List<UseCaseType> getUseCase() {
        if (useCase == null) {
            useCase = new ArrayList<UseCaseType>();
        }
        return this.useCase;
    }

}