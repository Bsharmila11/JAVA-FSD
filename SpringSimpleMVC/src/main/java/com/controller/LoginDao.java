package com.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Login;
@Repository
public class LoginDao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	//public int signIn(Login login) {
		//try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root" , "Sharmila@11");
	//	PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
	//	pstmt.setString(1, login.getEmail());
	//	pstmt.setString(2, login.getPassword());
	//	ResultSet rs = pstmt.executeQuery();
	//	if(rs.next()) {
	//		return 1;
	//	}
	//	} catch (Exception e) {
	//		System.out.println(e);
	//		return 0;
	//	}
	//	return 0;
	//}
	
	
	
	//public int signIn(Login login) {
	//	try {
	//	Connection con=ds.getConnection();
	//	PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
	//	pstmt.setString(1, login.getEmail());
	//	pstmt.setString(2, login.getPassword());
	//	ResultSet rs = pstmt.executeQuery();
	//	if(rs.next()) {
	//		return 1;
	//	}
	//	} catch (Exception e) {
	//		System.out.println(e);
	//		return 0;
	//	}
	//	return 0;
//	}
	
	public int signIn(Login login) {
		try {
			List ll=jdbcTemplate.queryForList("select * from login where email = ? and password = ?",login.getEmail(),login.getPassword());
			return ll.size();
		}
		catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	
	}
	
	
	
	//public int signUp(Login login) {
	//	try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root" , "Sharmila@11");
	//	PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
	//	pstmt.setString(1, login.getEmail());
	//	pstmt.setString(2, login.getPassword());
	//	int res = pstmt.executeUpdate();
		//if(res>0) {
		//	return 1;
	//	}
	//	} catch (Exception e) {
		//	System.out.println(e);
		//	return 0;
	//	}
	//	return 0;
	//}
	
	
	//public int signUp(Login login) {
	//	try {
		//	Connection con=ds.getConnection();
		//PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
		//pstmt.setString(1, login.getEmail());
		//pstmt.setString(2, login.getPassword());
		//int res = pstmt.executeUpdate();
	//	if(res>0) {
		//	return 1;
		//}
	//	} catch (Exception e) {
			//System.out.println(e);
			//return 0;
		//}
		//return 0;
	//}
	
	public int signUp(Login login) {
		try {
			return jdbcTemplate.update("insert into login values(?,?)",login.getEmail(),login.getPassword());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
	}
}
	

