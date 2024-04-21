/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.PropertyEnlist;
import exceptions.ExceptionHandling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import service.IPropertyService;
import util.DbUtil;

/**
 *
 * @author Aditya Prakash
 */
public class PropertyDAOImpl implements IPropertyService {
    
//    PropertyEnlist pe;

    public PropertyDAOImpl() {
        
    }    
    
    /**
     *
     * @param pe
     */
    @Override
    public void AddProperty(PropertyEnlist pe) {
        try {
            Connection conn = DbUtil.getConnection();
            PreparedStatement prep = conn.prepareStatement(IQueryMapper.INSERT_PROPERTY_OWNER);
            //PreparedStatement prep1 = conn.prepareStatement(IQueryMapper.INSERT_PROPERTY_REVIEW);
            
            prep.setString(1,pe.getPropertyName());
            prep.setString(2,pe.getStreet());
            prep.setString(3,pe.getCity());
            prep.setString(4,pe.getState());
            prep.setString(5, pe.getZipCode());
            prep.setString(6, pe.getCapacity());
            //String pGender = jComboBox1.getSelectedItem().toString();
            prep.setBytes(7,pe.getImg_1());
            prep.setBytes(8, pe.getImg_2());
            prep.setString(9,pe.getStatus());
            prep.setString(10,pe.getPropertyOwner());
          
            prep.executeUpdate();
            //prep1.executeUpdate();
            }    
         catch (ExceptionHandling | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
         }
    }
    
}
