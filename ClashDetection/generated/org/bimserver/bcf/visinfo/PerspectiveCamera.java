//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.26 at 10:52:28 AM CEST 
//


package org.bimserver.bcf.visinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerspectiveCamera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerspectiveCamera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraViewPoint" type="{}Point"/>
 *         &lt;element name="CameraDirection" type="{}Direction"/>
 *         &lt;element name="CameraUpVector" type="{}Direction"/>
 *         &lt;element name="FieldOfView" type="{}FieldOfView"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerspectiveCamera", propOrder = {
    "cameraViewPoint",
    "cameraDirection",
    "cameraUpVector",
    "fieldOfView"
})
public class PerspectiveCamera {

    @XmlElement(name = "CameraViewPoint", required = true)
    protected Point cameraViewPoint;
    @XmlElement(name = "CameraDirection", required = true)
    protected Direction cameraDirection;
    @XmlElement(name = "CameraUpVector", required = true)
    protected Direction cameraUpVector;
    @XmlElement(name = "FieldOfView")
    protected double fieldOfView;

    /**
     * Gets the value of the cameraViewPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getCameraViewPoint() {
        return cameraViewPoint;
    }

    /**
     * Sets the value of the cameraViewPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setCameraViewPoint(Point value) {
        this.cameraViewPoint = value;
    }

    /**
     * Gets the value of the cameraDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getCameraDirection() {
        return cameraDirection;
    }

    /**
     * Sets the value of the cameraDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setCameraDirection(Direction value) {
        this.cameraDirection = value;
    }

    /**
     * Gets the value of the cameraUpVector property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getCameraUpVector() {
        return cameraUpVector;
    }

    /**
     * Sets the value of the cameraUpVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setCameraUpVector(Direction value) {
        this.cameraUpVector = value;
    }

    /**
     * Gets the value of the fieldOfView property.
     * 
     */
    public double getFieldOfView() {
        return fieldOfView;
    }

    /**
     * Sets the value of the fieldOfView property.
     * 
     */
    public void setFieldOfView(double value) {
        this.fieldOfView = value;
    }

}
