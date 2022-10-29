package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBconnect;
import com.DataInp.BookDataImpl;
import com.Entity.BookDetails;

@WebServlet("/delete")
public class Deletebook  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		BookDataImpl bdi=new BookDataImpl(DBconnect.getConn());
		BookDetails book = new BookDetails();
		boolean deleted=bdi.deleteBook(id);
		
		HttpSession session=req.getSession();
		if(deleted) {
			session.setAttribute("succMsg", "Book Deleted Sucessfully...");
			resp.sendRedirect("admin/allbooks.jsp");
		}
		else {
			session.setAttribute("failMsg", "Something wrong on server");
			resp.sendRedirect("admin/allbooks.jsp");
		}
	}
 
}
