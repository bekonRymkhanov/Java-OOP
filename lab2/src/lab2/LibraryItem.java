package lab2;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	
	public LibraryItem() {
		this.title="";
		this.author="";
		this.publicationYear=0;
	}public LibraryItem(String title,String author,int publicationYear) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	
	public String getTitle() {
		return this.title;
	}public void setTitle(String title) {
		this.title=title;
	}public String getAuthor() {
		return this.author;
	}public void setAuthor(String author) {
		this.author=author;
	}	public int getPublicationYear() {
		return this.publicationYear;
	}public void setPublicationYear(int year) {
		this.publicationYear=year;
	}
	
	abstract String material();
	abstract String use();
	
	
	public String toString() {
		return "title: "+this.title+"author: "+this.author+"publication Year: "+this.publicationYear;
	}
	
}
