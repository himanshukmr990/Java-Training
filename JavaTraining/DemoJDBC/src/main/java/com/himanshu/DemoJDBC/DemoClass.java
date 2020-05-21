package com.himanshu.DemoJDBC;

import java.sql.*;
/**
 * Hello world!
 *
 */
public class DemoClass 
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/abc";
        String uname = "root";
        String pass = "peng";
        int userid = 3;
        String username = "Mukul";
        String query = "insert into student values(?,?)";
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(query); //PreparedStatement
        st.setInt(1, userid);
        st.setString(2, username);
//		ResultSet rs = st.executeQuery(query); 
        int count = st.executeUpdate();
//        
//        while(rs.next())
//        {
//        String name = rs.getString("username");
//        
//        String userdata = rs.getInt(1) + " : " + rs.getString(2);
//        System.out.println(userdata);
//        }
        
        System.out.println(count + " row/s affected");
        st.close();
        con.close();
    }
}
