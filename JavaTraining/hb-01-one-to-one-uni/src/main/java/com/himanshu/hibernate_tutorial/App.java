package com.himanshu.hibernate_tutorial;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String jdbcUrl= "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";
        
        try {
        	System.out.println("Connecting to database: " + jdbcUrl);
        	
        	Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
        	System.out.println("Connection sucessfull!!");
        }
        catch (Exception exc) {
        	exc.printStackTrace();
        }
    }
}
