//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.18 at 11:25:20 AM IST 
//


package com.jaxb.scenario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxb.scenario package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
	
    private final static QName _TestClasses_QNAME = new QName("", "test-classes");
    private final static QName _TestClass_QNAME = new QName("", "test-class");
    private final static QName _TestClassTypeTestMethod_QNAME = new QName("", "test-method");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxb.scenario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestClassesType }
     * 
     */
    public TestClassesType createTestClassesType() {
        return new TestClassesType();
    }

    /**
     * Create an instance of {@link ParamsType }
     * 
     */
    public ParamsType createParamsType() {
        return new ParamsType();
    }

    /**
     * Create an instance of {@link TestCaseType }
     * 
     */
    public TestCaseType createTestCaseType() {
        return new TestCaseType();
    }

    /**
     * Create an instance of {@link TestClassType }
     * 
     */
    public TestClassType createTestClassType() {
        return new TestClassType();
    }

    /**
     * Create an instance of {@link AssertType }
     * 
     */
    public AssertType createAssertType() {
        return new AssertType();
    }

    /**
     * Create an instance of {@link TestMethodType }
     * 
     */
    public TestMethodType createTestMethodType() {
        return new TestMethodType();
    }

    /**
     * Create an instance of {@link AssertsType }
     * 
     */
    public AssertsType createAssertsType() {
        return new AssertsType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClassesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "test-classes")
    public JAXBElement<TestClassesType> createTestClasses(TestClassesType value) {
        return new JAXBElement<TestClassesType>(_TestClasses_QNAME, TestClassesType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "test-class")
    public JAXBElement<TestClassType> createTestClass(TestClassType value) {
        return new JAXBElement<TestClassType>(_TestClass_QNAME, TestClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "test-method", scope = TestClassType.class)
    public JAXBElement<TestMethodType> createTestClassTypeTestMethod(TestMethodType value) {
        return new JAXBElement<TestMethodType>(_TestClassTypeTestMethod_QNAME, TestMethodType.class, TestClassType.class, value);
    }
  }