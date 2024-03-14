package lab2;

public class Book extends LibraryItem{
	private int pages;
	
	public Book() {
		super();
		this.pages=0;
	}public Book(String title,String author,int publicationYear,int pages){
		super(title,author,publicationYear);
		this.pages=pages;
	}
	
	public int getPages() {
		return this.pages;
	}public void setPages(int pages) {
		this.pages=pages;
	}

	String material() {
		return "paper leather";
	}
	String use() {
		return "you are read the book right now";
	}
	
	public String toString() {
		return super.toString()+"pages: "+this.pages;
	}
}
