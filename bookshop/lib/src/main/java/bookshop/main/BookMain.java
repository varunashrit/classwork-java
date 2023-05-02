package bookshop.main;


import bookshop.dao.BookDAO;
import bookshop.dao.BookDAOImpl;
import bookshop.data.Book;

	public class BookMain {

		public static void main(String[] args) {
			BookDAO bookDao = new BookDAOImpl();
			
			Book b = new Book();
			Book b1 = new Book();
			b.setBookId(null);
			b.setBookName("Men are brave");
			b.setPublisher("Batman");
			b.setPrice(9090.909);
			b1.setBookId(null);
			b1.setBookName("Women are brave");
			b1.setPublisher("Superman");
			b1.setPrice(922.1);
			System.out.println(bookDao.getBooks());
			System.out.println(bookDao.getBookById(2));
			System.out.println(bookDao.getBookByName("C Programming"));
			System.out.println(bookDao.getBookByName("Men are brave"));
//			System.out.println(bookDao.addBook(b));
//			System.out.println(bookDao.addBook(b1));
//			System.out.println(bookDao.deleteBookById(12));
			System.out.println(bookDao.getBookByPublishers("Batman"));
			System.out.println(bookDao.updateBookDetails1("Batman"));

		

		}

	}



