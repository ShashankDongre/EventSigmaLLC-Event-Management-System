/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.User;
import exceptions.ExceptionHandling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import service.ILoginService;
import util.DbUtil;

/**
 *
 * @author shash
 */
public class LoginDAOImpl implements ILoginService {
    User user;
    
    public LoginDAOImpl(User user){
        this.user = user;
       
    }
    
    @Override
    public void RegisteredUser() {
        try {
            Connection conn = DbUtil.getConnection();
            PreparedStatement prep = conn.prepareStatement(IQueryMapper.INSERT_USERS);
            prep.setString(1, user.getEmail());
            prep.setString(2, user.getPassword());
            
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Login Successful");
            
        } catch (ExceptionHandling | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    } 
}
