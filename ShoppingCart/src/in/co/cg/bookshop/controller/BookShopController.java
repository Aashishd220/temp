package in.co.cg.bookshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.cg.bookshop.service.BookShopService;
import in.co.cg.bookshop.pojo.Books;

/**
 * Servlet implementation class BookShopController
 */
@WebServlet("/BookShopController")
public class BookShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BookShopService bookShopService=new BookShopService();
		List<Books> bookList=bookShopService.addBooks(); 
		System.out.println(bookList);
		request.setAttribute("books",bookList);

		//Request for output.jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
		String bookName=request.getParameter("bookId");
		System.out.println(bookName);
		//bookShopService.addBookCart(id);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
