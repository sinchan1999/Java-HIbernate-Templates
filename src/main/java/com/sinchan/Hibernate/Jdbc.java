package com.sinchan.Hibernate;

//Fetching all data from the table
//***alien_db containes two tables Alien & student_address 
import java.sql.*;
public class Jdbc {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/alien_db";
		String uname="root";
		String pass="password";
		//String query="SELECT *FROM Alien";
		String query="SELECT *FROM student_address ";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		
		String allData=" ";
		
		while(rs.next())
		{
			//allData=rs.getInt(1)+" : "+rs.getString(2)+"     : "+rs.getString(3);
			allData=rs.getInt(1)+" : "+rs.getString(2)+"   : "+rs.getString(3)+"   : "+rs.getString(5)+"   : "+rs.getString(6);		
			System.out.println(allData);
			
		}				
		
		st.close();
		con.close();
	}

}

