/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import java.sql.*;

/**
 *
 * @author User
 */
public class validate {

    static boolean checkUser(String Username, String Password) {
        boolean st = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labexercise_3","root","");
            PreparedStatement ps = con.prepareStatement("select * from admin where admin_username=? and admin_password=?");
            
            ps.setString(1,Username);
            ps.setString(2,Password);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return st;
    }
    
}
