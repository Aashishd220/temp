package in.cg.bookshop.service;

import java.util.Collection;
import java.util.List;

import in.co.cg.bookshop.pojo.Books;

public interface BookShopServiceI {
	
	public List<Books> addBooks() ;
	
	void addBookCart(int id);

	Collection<Books> viewBookCart();

	void removeBookFromCart(int BookId);

}