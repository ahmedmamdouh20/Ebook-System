package com.admin.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBconnect;
import com.DataInp.BookDataImpl;
import com.Entity.BookDetails;

@WebServlet("/edit")
public class Editbook extends HttpServlet  {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("bname");
			String author = req.getParameter("author");
			String price =req.getParameter("price");
			String category = req.getParameter("btype");
			String status = req.getParameter("bstatus");
	        

			BookDetails book = new BookDetails();
			book.setBookID(id);
			book.setName(name);
			book.setAuthor(author);
			book.setPrice(price);
			book.setStatus(status);
			book.setCategory(category);
			
			BookDataImpl bdi=new BookDataImpl(DBconnect.getConn());
			
			boolean updated=bdi.editBook(book);
			HttpSession session=req.getSession();
			if(updated) {
				session.setAttribute("succMsg", "Book Updated Sucessfully");
				resp.sendRedirect("admin/allbooks.jsp");
			}
			else {
				session.setAttribute("failMsg", "Something wrong on server");
				resp.sendRedirect("admin/allbooks.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	}
  

