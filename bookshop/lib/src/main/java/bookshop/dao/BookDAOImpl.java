package bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookshop.data.Book;
import bookshop.utils.DBUtils;

public class BookDAOImpl implements BookDAO {
	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		try {
			Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
			PreparedStatement prpd=conn.prepareStatement("insert into book(bookname,publisher,price) values (?,?,?)");
			prpd.setString(1, book.getBookName());
			prpd.setString(2,book.getPublisher());
			prpd.setDouble(3,book.getPrice());
			int rs=prpd.executeUpdate();
			if(rs<1)
			{
				throw new SQLException();
			}
			prpd.close();
			conn.close();
			
		}catch(SQLException e) {e.printStackTrace();}
		return "Record inserted successfully";
	}
	@Override
	public Book getBookById(Integer bookId) {
		Book book=new Book();
		try {
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
		PreparedStatement prpd=conn.prepareStatement("select * from book where bookid=?");
		prpd.setInt(1, bookId);
		ResultSet rs=prpd.executeQuery();
		while(rs.next()) {
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setPublisher(rs.getString(3));
			book.setPrice(rs.getDouble(4));
		}
		prpd.close();
		rs.close();
		conn.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
	@Override
	public Book getBookByName(String bookName) {
		// TODO Auto-generated method stub
		Book book=new Book();
		try {
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
		PreparedStatement prpd=conn.prepareStatement("Select * from book where bookname=?");
		prpd.setString(1, bookName);
		ResultSet rs=prpd.executeQuery();
		while(rs.next()) {
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setPublisher(rs.getString(3));
			book.setPrice(rs.getDouble(4));
		}
		prpd.close();
		rs.close();
		conn.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
	@Override
	public List<Book> getBookByPublishers(String publisher) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		try {
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
			PreparedStatement prpd=conn.prepareStatement("Select * from book where publisher=?");
			prpd.setString(1, publisher);
			ResultSet rs= prpd.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getDouble(4));
				books.add(book);
			}
		}catch (SQLException e) {e.printStackTrace();}
		return books;
	}
	@Override
	public List<Book> updateBookDetails1(String publisher) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
			PreparedStatement prpd=conn.prepareStatement("UPDATE book SET bookname = 'MEN ARE BRAVE' WHERE publisher = ?;");
			prpd.setString(1, publisher);
			ResultSet rs= prpd.executeQuery();
			while(rs.next()) {
				Book book = new Book();
//				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getDouble(4));
				books.add(book);
			}
		}catch (SQLException e) {
			System.out.println("Record not found");
		}
		return books;
	}
		
	@Override
	public String deleteBookById(Integer bookId) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
			PreparedStatement prpd=conn.prepareStatement("delete from book where bookid=?");
			prpd.setInt(1,bookId);
			int result=prpd.executeUpdate();
			if(result<1) {
				throw new SQLException("Record not deleted");
			}
		}catch(SQLException e) {e.printStackTrace();}
		
		return "Succesfully deleted";
	}
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		List<Book> books= new ArrayList<>();
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
			Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from book");
			while(rs.next()) {
				Book book= new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getDouble(4));
				books.add(book);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}
	
	@Override
	public List<Book> getBookByName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Book getBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateBookDetails(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}