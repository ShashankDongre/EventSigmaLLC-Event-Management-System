/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class Reviewed_Events {
    public String eventID;
    public String eventName;
    public String propertyName;
    public String location;
    public String eventType;
    public String hostedBy;
    public String createdBy;
    public String date;

    public Reviewed_Events(String eventID, String eventName, String propertyName, String location, String eventType, String hostedBy, String createdBy, String date) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.propertyName = propertyName;
        this.location = location;
        this.eventType = eventType;
        this.hostedBy = hostedBy;
        this.createdBy = createdBy;
        this.date = date;
    }

    
    
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getHostedBy() {
        return hostedBy;
    }

    public void setHostedBy(String hostedBy) {
        this.hostedBy = hostedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
}
