/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */


public class PropertyEnlist {
    
    private String propertyID;
    private String propertyName;
    private String street;
    private String city; 
    private String state;
    private String zipCode;
    private String Capacity;
    //private String imgPath;
    //private String imgPath1;
    private byte[] img_1;
    private byte[] img_2;
    private String status; 
    private String PropertyOwner;

    public PropertyEnlist(String propertyID, String propertyName, String Capacity, String Street, String City) {
        this.propertyID = propertyID;
        this.propertyName = propertyName;
        this.street = Street;
        this.city = City;
        //this.state = state;
        //this.zipCode = zipCode;
        this.Capacity = Capacity;
       // this.img_1 = img_1;
        //this.img_2 = img_2;
        //this.status = status;
    }
    public PropertyEnlist(){
        
    }
     public PropertyEnlist(String propertyID, String propertyName, String status) {
        this.propertyID = propertyID;
        this.propertyName = propertyName;
        //this.street = street;
        //this.city = city;
        //this.state = state;
        //this.zipCode = zipCode;
        //this.Capacity = Capacity;
       // this.img_1 = img_1;
        //this.img_2 = img_2;
        this.status = status;
    }

    public String getPropertyOwner() {
        return PropertyOwner;
    }

    public void setPropertyOwner(String PropertyOwner) {
        this.PropertyOwner = PropertyOwner;
    }

    public PropertyEnlist(String propertyID, String propertyName, String Capacity, String street, String city, String status, String PropertyOwner) {
        this.propertyID = propertyID;
        this.propertyName = propertyName;
        this.street = street;
        this.city = city;
        this.Capacity = Capacity;
        
        this.status = status;
        this.PropertyOwner = PropertyOwner;
    }
    
    
    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }
    
    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return propertyName;
    }
    
}
