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
import util.DbUtil;

/**
 *
 * @author shash
 */
public class SignUpDAOImpl {

    User user;

    public SignUpDAOImpl(User user) {
        this.user = user;
    }

    public void RegistereUser() {
        try {
            Connection conn = DbUtil.getConnection();
            PreparedStatement prep = conn.prepareStatement(IQueryMapper.INSERT_USERS);
            PreparedStatement prep1 = conn.prepareStatement(IQueryMapper.INSERT_PROPERTY_REVIEW);

            prep.setString(1, user.getFirstName());
            prep.setString(2, user.getLastName());
            prep.setString(3, user.getEmail());
            prep.setString(4, user.getPassword());
            prep.setString(5, user.getEmail());
            prep.setString(6, user.getMobile());
            prep.setString(7, user.getRole());// password

            //java.util.Date d;
            //String s;
            //d = new java.util.Date(jDob.getDate());
            //SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            //Date dob = jDob.getDate();
            //s = df.format(dob);
            //          prep.setString(8, s);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Created Successfully");
        } catch (ExceptionHandling | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
;
}
