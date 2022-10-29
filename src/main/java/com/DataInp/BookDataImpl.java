package com.DataInp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Entity.BookDetails;
import com.Entity.User;

public class BookDataImpl implements BookData {

	private Connection conn;
	public BookDataImpl (Connection conn) {
		super();
		this.conn=conn;
	}
	
	
	@Override
	public boolean addBook(BookDetails book) {
		boolean flag=false;
		try {
			String sql="insert into book_add(bookname,author,price,bookcategory,status,photo)VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getPrice());
			ps.setString(4, book.getCategory());
			ps.setString(5, book.getStatus());
			ps.setString(6, book.getPhotoName());
			int rows=ps.executeUpdate();
            if(rows==1) {
            	flag=true;
            }
            
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


	@Override
	public List<BookDetails> getAllBooks() {
		List<BookDetails> list=new ArrayList<BookDetails>();
		BookDetails book=null;
		try {
			String sql="select * from book_add";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				book=new BookDetails();
				book.setBookID(rs.getInt(1));
				book.setName((rs.getString(2)));
				book.setAuthor((rs.getString(3)));
				book.setPrice((rs.getString(4)));
				book.setCategory(rs.getString(5));
				book.setStatus((rs.getString(6)));
				book.setPhotoName(rs.getString(7));
				list.add(book);
            }

		}catch(Exception e) {
			e.printStackTrace();
		}
	    return list;
	}


	@Override
	public BookDetails getBook(int id) {
		BookDetails book=null;
		try {
			String sql="select * from book_add where bookID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				book=new BookDetails();
				book.setBookID(rs.getInt(1));
				book.setName((rs.getString(2)));
				book.setAuthor((rs.getString(3)));
				book.setPrice((rs.getString(4)));
				book.setCategory(rs.getString(5));
				book.setStatus((rs.getString(6)));
				book.setPhotoName(rs.getString(7));
            }

		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}


	@Override
	public boolean editBook(BookDetails book) {
		boolean flag=false;
		try {
			String sql="update book_add set bookname=?, author=?, price=?, bookcategory=?, status=? where bookID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getPrice());
			ps.setString(4, book.getCategory());
			ps.setString(5, book.getStatus());
			ps.setInt(6, book.getBookID());
			int rows=ps.executeUpdate();
            if(rows==1) {
            	flag=true;
            }
            
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


	@Override
	public boolean deleteBook(int id) {
		boolean flag=false;
		try {
			String sql="delete from book_add where bookID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			 if(rows==1) {
	            	flag=true;
	            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
     
}
