/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shash
 */
public class Validations {

    private String firstname;
    private String lastname;
    private String mobile;
    private String email;
    private String password;
    private String username;
    
    public String checkName(String firstname) {
        this.firstname = firstname;

        String PATTERN = "^[a-zA-Z]{2,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstname);
        if (!match.matches()) {
            return "Field MUST contain alphabets only";
        }
        return "";
        
    }
    

    public String checkValidFirstName(String firstname) {
        this.firstname = firstname;

        String PATTERN = "^[a-zA-Z]{2,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstname);
        if (!match.matches()) {
            return "First Name MUST contain alphabets only";
        }
        return "";
        
    }
	 public String checkVaildLastName(String lastname){
        this.lastname = lastname;
        
        String PATTERN = "^[a-zA-Z]{2,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(lastname);
        if (!match.matches()) {
            return "Last Name MUST contain alphabets only";
        }
        return "";
    }
    public String checkVaildMobile(String mobile){
        this.mobile = mobile;
        
        String PATTERN = "^[0-9]{10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(mobile);
        if (!match.matches()) {
            return "Mobile number is not valid";
        }
        return "";
    }
	public String checkValidEmail(String email){
        this.email = email;
        
        String PATTERN = "^[a-zA-Z0-9]{0,20}[@][a-zA-Z0-9]{0,20}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(email);
        if (!match.matches()) {
            return "Email address is not valid";
        }
        return "";
    }
	 
	public String checkValidPassword(String password){
        this.password = password;
        
        String PATTERN = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(password);
        if (!match.matches()) {
            return "Minimum 8 character alphanumeric Password with a special symbol required";
        }
        return "";
    
    }
	
	  public String checkValidUsername(String username){
        this.username = username;
        
        String PATTERN = "^[a-zA-Z0-9]{0,20}[@][a-zA-Z0-9]{0,20}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(username);
        if (!match.matches()) {
            return "Username is not valid";
        }
        return "";
    
    }
	
	
      
}
