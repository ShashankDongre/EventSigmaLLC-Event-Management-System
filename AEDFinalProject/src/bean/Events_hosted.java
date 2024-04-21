/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class Events_hosted {
    public String eventID;
    public String event_Name;
    public String organizer;
    public String address;
    public String food;
    public int available_tickets;

    public Events_hosted(String eventID, String event_Name, String organizer, String address, String food, int available_tickets) {
        this.eventID = eventID;
        this.event_Name = event_Name;
        this.organizer = organizer;
        this.address = address;
        this.food = food;
        this.available_tickets = available_tickets;
    }
    
    
    
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEvent_Name() {
        return event_Name;
    }

    public void setEvent_Name(String event_Name) {
        this.event_Name = event_Name;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAvailable_tickets() {
        return available_tickets;
    }

    public void setAvailable_tickets(int available_tickets) {
        this.available_tickets = available_tickets;
    }
    
    
}
