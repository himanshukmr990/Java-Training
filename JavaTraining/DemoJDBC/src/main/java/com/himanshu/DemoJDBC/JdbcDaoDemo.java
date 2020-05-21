package com.himanshu.DemoJDBC;

import java.sql.*;

public class JdbcDaoDemo {

	public static void main(String[] args) 
	{
	   StudentDao dao = new StudentDao();
	   Alien s2 = new Alien();
	   s2.userid = 3;
	   s2.username = "Rahul";
	   
	   dao.connect();
	   dao.addStudent(s2);
//	   dao.removeStudent(s2);
//	   Student s1 = dao.getStudent(1);
//     System.out.println(s1.username);
	     
	}
}

class StudentDao
{
	Connection con =null;
	public void connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","peng");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	public Alien getStudent(int userid)
	{
		String query = "select username from student where userid="+userid;
		Alien s = new Alien();
		s.userid = userid;
		try {
			
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    rs.next();
		    String name = rs.getString(1);
		    s.username = name;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
    
	public void addStudent(Alien s)
	{
		String query = "insert into student values(?,?)";
		PreparedStatement pat;
		try {
			pat = con.prepareStatement(query);
			pat.setInt(1, s.userid);
			pat.setString(2, s.username);
			pat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void removeStudent(Alien s)
	{
		String query = "delete from student where userid="+s.userid;
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate(query); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Alien
{
	int userid;
	String username;
}
