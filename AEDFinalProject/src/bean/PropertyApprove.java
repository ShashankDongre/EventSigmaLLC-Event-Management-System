/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Divyesh Rajput
 */
public class PropertyApprove {
    String PropertyID ; 
    String PropertyOwner;
    String PropertyName;
    String Approver;

    public PropertyApprove(String PropertyID, String PropertyName) {
        this.PropertyID = PropertyID;
        this.PropertyName = PropertyName;
    }

    public PropertyApprove(String PropertyID, String PropertyOwner, String PropertyName) {
        this.PropertyID = PropertyID;
        this.PropertyOwner = PropertyOwner;
        this.PropertyName = PropertyName;
    }

    public PropertyApprove(String PropertyID, String PropertyOwner, String PropertyName, String Approver) {
        this.PropertyID = PropertyID;
        this.PropertyOwner = PropertyOwner;
        this.PropertyName = PropertyName;
        this.Approver = Approver;
    }
    
    
    
    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public String getPropertyOwner() {
        return PropertyOwner;
    }

    public void setPropertyOwner(String PropertyOwner) {
        this.PropertyOwner = PropertyOwner;
    }

    public String getPropertyName() {
        return PropertyName;
    }

    public void setPropertyName(String PropertyName) {
        this.PropertyName = PropertyName;
    }

    public String getApprover() {
        return Approver;
    }

    public void setApprover(String Approver) {
        this.Approver = Approver;
    }
    
    
    
}
