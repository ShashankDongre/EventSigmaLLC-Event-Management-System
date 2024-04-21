/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class Ticket {
    public String EventID;
    public String EventName;
    public String Name;
    public String EmailID;
    public String Status;

    public Ticket(String EventID, String EventName, String Name, String EmailID, String Status) {
        this.EventID = EventID;
        this.EventName = EventName;
        this.Name = Name;
        this.EmailID = EmailID;
        this.Status = Status;
    }
    
    
    
    public String getEventID() {
        return EventID;
    }

    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
