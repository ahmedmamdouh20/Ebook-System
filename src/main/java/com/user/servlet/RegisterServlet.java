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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
           String name=req.getParameter("fname");
           String email=req.getParameter("email");
           String phno=req.getParameter("phone_no");
           String password=req.getParameter("pass");
           String check=req.getParameter("check");
           User user=new User();
           user.setName(name);
           user.setEmail(email);
           user.setPhoneNo(phno);
           user.setPassword(password);
           
           HttpSession session=req.getSession();
           UserDataImpl UDI= new UserDataImpl(DBconnect.getConn());
           boolean f=UDI.userRegister(user);
           if(f) {
        	   session.setAttribute("SuccMsg", "Register Success.....");
        	   resp.sendRedirect("register.jsp");
           }
           else {
        	   session.setAttribute("FailMsg", "Register Fail.....");
        	   resp.sendRedirect("register.jsp");

           }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
