/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class Food_items {
    public String type;
    public String dish_name;
    public String Vegetarian;

    public Food_items(String type, String dish_name, String Vegetarian) {
        this.type = type;
        this.dish_name = dish_name;
        this.Vegetarian = Vegetarian;
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getVegetarian() {
        return Vegetarian;
    }

    public void setVegetarian(String Vegetarian) {
        this.Vegetarian = Vegetarian;
    }
    
    
}
