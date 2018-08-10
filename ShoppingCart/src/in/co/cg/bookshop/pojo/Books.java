package in.co.cg.bookshop.pojo;

public class Books {
	private String bookName;
	private String authorName;
	private String bookDesc;
	private int bookPrice;
	private int bookId;
	public String getBookName() {
		return bookName;
	}
public Books() {
	
}


	public Books(int bookId,String bookName, String authorName, String bookDesc, int bookPrice) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookDesc = bookDesc;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
	}



	public String getAuthorName() {
		return authorName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public int getBookId() {
		return bookId;
	}



	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", authorName=" + authorName + ", bookDesc=" + bookDesc + ", bookPrice="
				+ bookPrice + ", bookId=" + bookId + "]";
	}

	
}
