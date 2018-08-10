package in.co.cg.bookshop.dao;

import java.util.Collection;
import java.util.List;

import in.co.cg.bookshop.pojo.Books;

public interface BookShopDAOI {

	List<Books> addBooks();

	void addBookCart(int id);

	Collection<Books> viewBookCart();

	void removeBookFromCart(int BookId);

}