/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class Caterer {
    
   public String catererID;
   public String caterer_Name;
   public String address;
   public String phone;
   public String ratings;
   public String package_name;
   public String price;
   public String appetizer;
   public String main_course;
   public String dessert;

    public Caterer(String catererID, String caterer_Name, String package_name, String price) {
        this.catererID = catererID;
        this.caterer_Name = caterer_Name;
        this.package_name = package_name;
        this.price = price;
    }

    public Caterer(String catererID, String caterer_Name, String address, String phone, String ratings) {
        this.catererID = catererID;
        this.caterer_Name = caterer_Name;
        this.address = address;
        this.phone = phone;
        this.ratings = ratings;
    }

   
    public String getCatererID() {
        return catererID;
    }

    public void setCatererID(String catererID) {
        this.catererID = catererID;
    }

    public String getCaterer_Name() {
        return caterer_Name;
    }

    public void setCaterer_Name(String caterer_Name) {
        this.caterer_Name = caterer_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getMain_course() {
        return main_course;
    }

    public void setMain_course(String main_course) {
        this.main_course = main_course;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
   
    @Override
    public String toString() {
        return caterer_Name;
    }
           
    
}
