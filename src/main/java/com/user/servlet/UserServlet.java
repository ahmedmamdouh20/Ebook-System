package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBconnect;
import com.DataInp.UserDataImpl;
import com.Entity.User;

@WebServlet("/login")
public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			 HttpSession session=req.getSession();
	         UserDataImpl UDI= new UserDataImpl(DBconnect.getConn());
	  
			String email = req.getParameter("email");
	        String password=req.getParameter("password");
	        
	        if("admin@gmail.com".equals(email) && "admin".equals(password)) {
	        	User user=new User();
	        	session.setAttribute("userobj", user);
	        	resp.sendRedirect("admin/home.jsp");
	        }
	        else {
	        	User user=UDI.userLogin(email, password);
	        	if(user!=null) {
	        		session.setAttribute("userobj", user);
		        	resp.sendRedirect("home.jsp");
	        	}
	        	else {
	        		session.setAttribute("failedMsg", "Email & Password Invalid");
		        	resp.sendRedirect("login.jsp");
	        	}
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
