/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Aditya Prakash
 */
public class Events extends PropertyEnlist {

    private String eventName;
    private String eventDescription;
    private String eventType;
    private String fromDate;
    private String toDate;
    private String eventTiming;
    private byte[] img_1;
    private byte[] img_2;
    private String eventStatus;
    private String eventAdmin;
    private String eventId;
    private String contact;
    private String location;
    private String hostedBy;
    private String propertyName;
    public String image;
    String requestType;

   

   
    public Events() {
    }

    public Events(String eventId,
            String eventName,
            String capacity,
            String eventType,
            String location,
            String eventStatus,
            String contact,
            String eventDescription,
            String fromDate,
            String hostedBy,
            String eventTiming,
            String eventAdmin,
            String propertyName,
            String requestType) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.capacity = capacity;
        this.eventDescription = eventDescription;
        this.eventType = eventType;
        this.location = location;
        this.fromDate = fromDate;
        this.hostedBy = hostedBy;
        this.eventTiming = eventTiming;
        this.eventStatus = eventStatus;
        this.eventAdmin = eventAdmin;
        this.contact = contact;
        this.propertyName = propertyName;
        this.requestType = requestType;
    }

     public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    public String getHostedBy() {
        return hostedBy;
    }

     public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    private String capacity;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setHostedBy(String hostedBy) {
        this.hostedBy = hostedBy;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getEventTiming() {
        return eventTiming;
    }

    public void setEventTiming(String eventTiming) {
        this.eventTiming = eventTiming;
    }

    public byte[] getImg_1() {
        return img_1;
    }

    public void setImg_1(byte[] img_1) {
        this.img_1 = img_1;
    }

    public byte[] getImg_2() {
        return img_2;
    }

    public void setImg_2(byte[] img_2) {
        this.img_2 = img_2;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getEventAdmin() {
        return eventAdmin;
    }

    public void setEventAdmin(String eventAdmin) {
        this.eventAdmin = eventAdmin;
    }

    @Override
    public String toString() {
        return eventName;
    }

//    @Override
//    public String toString() {
//        return "Events{" + "eventName=" + eventName + ", eventDescription=" + eventDescription + ", eventType=" + eventType + ", fromDate=" + fromDate + ", toDate=" + toDate + ", eventTiming=" + eventTiming + ", img_1=" + img_1 + ", img_2=" + img_2 + ", eventStatus=" + eventStatus + ", eventAdmin=" + eventAdmin + ", eventId=" + eventId + ", contact=" + contact + ", location=" + location + ", hostedBy=" + hostedBy + ", propertyName=" + propertyName + ", image=" + image + ", capacity=" + capacity + '}';
//    }
   

}
