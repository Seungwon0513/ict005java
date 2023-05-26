

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;

	public Book() {

	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;

	}
	
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}

	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	
	public void setbookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getbookDiscountRate() {
		return bookDiscountRate;
	}

	public double getDsicountBookPrice() {
		return bookPrice * (1-bookDiscountRate);
	}
}