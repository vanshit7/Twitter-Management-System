package twittermanagementsystem;

import java.sql.*;

public class TwitterManagementSystem {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public TwitterManagementSystem() {
 try {
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter", "root", "");
     st = con.createStatement();
 } catch (Exception ex) {
     System.out.println("Error: " + ex);
     
 }
    }    
    
    public int getData(User ob[]) {
 try {
     String query = "select * from user";
     rs = st.executeQuery(query);
     int counter = 0;
     System.out.println("Records from Database");
     //System.out.println(rs.getString("name").toString());
     while (rs.next()) {
    int Id = rs.getInt("Id");
    ob[Id]=new User();
    ob[Id].setid(Id);
    ob[Id].setusername(rs.getString("name"));
    ob[Id].setfollowers(rs.getInt("No_Of_Followers"));
    ob[Id].setfollowing(rs.getInt("No_Of_People_Followed"));
    ob[Id].setstatus(rs.getString("status"));
    ob[Id].setmid(rs.getInt("M_id"));
    ob[Id].setpassword(rs.getString("password"));
    counter++;
    
     }
     return counter;
 } catch(Exception ex) {
     System.out.println(ex);
 }
    return 0;
    }
    
}
