package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
@Embeddable
public class BookInfo {

	private String bookType;
	private String genre;
	private int pages;
	
	public BookInfo() {
		super();
	}

	public BookInfo(String bookType, String genre, int pages) {
		super();
		this.bookType = bookType;
		this.genre = genre;
		this.pages = pages;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "BookInfo [bookType=" + bookType + ", genre=" + genre + ", pages=" + pages + "]";
	}

	
	
}
