package com.DataInp;

import java.sql.*;

import com.Entity.User;

public class UserDataImpl implements UserData {
     private Connection conn;
     public UserDataImpl(Connection conn) {
    	 super();
    	 this.conn=conn;
     }
	public boolean userRegister(User user) {
		boolean flag=false;
		try {
			String sql="insert into user(name,email,phone_no,password) values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhoneNo());
			ps.setString(4, user.getPassword());
			
			int rows=ps.executeUpdate();
            if(rows==1) {
            	flag=true;
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public User userLogin(String email,String password) {
		User user=null;
		try {
			String sql="select * From user where email=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	user=new User();
            	user.setId(rs.getInt(1));
            	user.setName(rs.getString(2));
            	user.setEmail(rs.getString(3));
            	user.setPhoneNo(rs.getString(4));
            	user.setPassword(rs.getString(5));
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
}
