package com.DataInp;

import java.util.List;

import com.Entity.BookDetails;

public interface BookData {
	public boolean addBook(BookDetails book);
	public List<BookDetails> getAllBooks();
	public BookDetails getBook(int id);
	public boolean editBook(BookDetails book);
	public boolean deleteBook(int id);
}
