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

@WebServlet("/addbook")
public class BookAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("bname");
			String author = req.getParameter("author");
			String price =req.getParameter("price");
			String category = req.getParameter("btype");
			String status = req.getParameter("bstatus");
			String fileName=req.getParameter("bimg");
			InputStream in = new FileInputStream("C:\\Users\\User\\Pictures\\"+fileName);
	        

			BookDetails book = new BookDetails(name, author, price, category, status, fileName);
			BookDataImpl bdi=new BookDataImpl(DBconnect.getConn());
			boolean added=bdi.addBook(book);
			HttpSession session=req.getSession();
			if(added) {
				session.setAttribute("succMsg", "Book add sucessfuly");
				resp.sendRedirect("admin/addbook.jsp");
			}
			else {
				session.setAttribute("failMsg", "Something wrong on server");
				resp.sendRedirect("admin/addbook.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
