//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.06 at 07:55:05 PM IST 
//


package com.tech.task.models;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.conduent.claim.models package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.conduent.claim.models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link Claim.ClaimLines }
     * 
     */
    public Claim.ClaimLines createClaimClaimLines() {
        return new Claim.ClaimLines();
    }

    /**
     * Create an instance of {@link Claim.ClaimLines.ClaimLine }
     * 
     */
    public Claim.ClaimLines.ClaimLine createClaimClaimLinesClaimLine() {
        return new Claim.ClaimLines.ClaimLine();
    }

}
