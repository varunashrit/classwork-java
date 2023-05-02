package bookshop.dao;


import java.util.List;

import bookshop.data.Book;

	public interface BookDAO {
		// Create
		public String addBook(Book book);

		// Retrieval
		public Book getBookById(Integer bookId);

		// Retrieval
		public Book getBookByName(String bookName);

		// Retrieval
		public Book getBookByPublisher(String publisher);

		// Update
		public String updateBookDetails(Book book);
		
		//Delete
		public String deleteBookById(Integer bookId);
		
		//Get All Books
		public List<Book> getBooks();

		public List<Book> getBookByName();
		public List<Book> getBookByPublishers(String publisher);

		public List<Book> updateBookDetails1(String publisher);
		
	}


