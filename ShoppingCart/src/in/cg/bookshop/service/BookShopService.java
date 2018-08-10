package in.cg.bookshop.service;

import java.util.Collection;
import java.util.List;

import in.co.cg.bookshop.dao.BookShopDAOI;
import in.co.cg.bookshop.dao.BookShopDao;
import in.co.cg.bookshop.pojo.Books;

public class BookShopService implements BookShopServiceI {
	BookShopDAOI bookShopDao = new BookShopDao();

	/* (non-Javadoc)
	 * @see in.cg.bookshop.service.BookShopServiceI#addBookCart(in.co.cg.bookshop.pojo.Books)
	 */
	@Override
	public void addBookCart(int id) {
		bookShopDao.addBookCart(id);
	}
	
	public List<Books> addBooks() {
		return bookShopDao.addBooks();
	}
	/* (non-Javadoc)
	 * @see in.cg.bookshop.service.BookShopServiceI#viewBookCart()
	 */
	@Override
	public Collection<Books> viewBookCart() {
		return bookShopDao.viewBookCart();
	}
	/* (non-Javadoc)
	 * @see in.cg.bookshop.service.BookShopServiceI#removeBookFromCart(int)
	 */
	@Override
	public void removeBookFromCart(int BookId) {
		bookShopDao.removeBookFromCart(BookId);
	}

}
