package in.co.cg.bookshop.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.co.cg.bookshop.pojo.Books;

public class BookShopDao implements BookShopDAOI {
	
	List<Books> bookDetails=new ArrayList<Books>();
	Map<Integer,Books> bookMap=new HashMap();

	/* (non-Javadoc)
	 * @see in.co.cg.bookshop.dao.BookShopDAOI#addBooks()
	 */
	@Override
	public List<Books> addBooks() {
		bookDetails.add(new Books(101,"Object-Oriented Programming C++","C++","E Balagurusamy",348));
		bookDetails.add(new Books(102,"The C language","C","Denis Ritche",223));
		bookDetails.add(new Books(103,"Python","Python crash course","Timothy",450));
		bookDetails.add(new Books(104,"Core Python","Python++","R. Rao",535));		
		return bookDetails;
	}
	/* (non-Javadoc)
	 * @see in.co.cg.bookshop.dao.BookShopDAOI#addBookCart(in.co.cg.bookshop.pojo.Books)
	 */
	@Override
	public void addBookCart(int id) {
		
		//	bookMap.put(books.getBookId(),books);
			
	}
	/* (non-Javadoc)
	 * @see in.co.cg.bookshop.dao.BookShopDAOI#viewBookCart()
	 */
	@Override
	public Collection<Books> viewBookCart() {
		return bookMap.values();
	}
	/* (non-Javadoc)
	 * @see in.co.cg.bookshop.dao.BookShopDAOI#removeBookFromCart(int)
	 */
	@Override
	public void removeBookFromCart(int BookId) {
		bookMap.remove(BookId);
}
}
