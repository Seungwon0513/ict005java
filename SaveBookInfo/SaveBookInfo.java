

class SaveBookInfo {
	String bookName;
	int rate;
	
	public SaveBookInfo() {
		
	}
	
	public SaveBookInfo (String bookName, int rate) {
		this.bookName = bookName;
		this.rate = rate;
	}
	
	
	public void setInfo(String bookName) {
		this.bookName = bookName;
	}
	
	public String getInfo() {
		return bookName;
		
	}
}
