

public class BookTest {

	public static void main(String[] args) {
		Book bookArray [] = new Book[3];

		bookArray[0] = new Book("SQL Plus", 50000, 0.05);
		bookArray[1] = new Book("Java 2.0", 40000, 0.03);
		bookArray[2] = new Book("JSP Servlet", 60000, 0.06);

		double totalPrice = 0;
		double discountedPrice = 0;
		
		for (Book book : bookArray) {
			System.out.println(book.getBookName() + " " + book.getBookPrice() + "원 " + (book.getbookDiscountRate() * 100) + "%");
			totalPrice += book.getBookPrice();
			discountedPrice += book.getBookPrice() - (book.getBookPrice() * book.getbookDiscountRate());
		}
		
		System.out.println("책 가격의 합: " + totalPrice + "원");
        System.out.println("할인 된 책 가격의 합: " + discountedPrice + "원");
    }
}