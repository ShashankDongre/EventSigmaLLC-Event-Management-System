/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import exceptions.ExceptionHandling;
import util.DbUtil;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aditya Prakash
 */
public class AEDFinalProject {

    /**
     * @param args the command line arguments
     * @throws exceptions.ExceptionHandling
     */
    public static void main(String[] args) throws ExceptionHandling {
        // TODO code application logic here
        try {
            Connection conn = DbUtil.getConnection();
            Statement st = conn.createStatement();

            ResultSet rs = null;
            String qs = "SELECT * FROM property_enlist";

            rs = st.executeQuery(qs);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }    
        } catch (SQLException ex) {
            throw new ExceptionHandling("Unable to retieve records");
        }
    }

}
