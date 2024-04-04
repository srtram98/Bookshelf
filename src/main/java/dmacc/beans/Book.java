package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
@Entity
@Data
public class Book {

	@Id
	@GeneratedValue
	private long id;
	@NotEmpty(message = "Can't be empty!")
	private String title;
	private String author;
	
	@Autowired
	private BookInfo bookInfo;

//	public Book() {
//		super();
//	}
//
//	public Book(String title) {
//		super();
//		this.title = title;
//	}
//
//	public Book(String title, String author) {
//		super();
//		this.title = title;
//		this.author = author;
//	}
//
//	public Book(String title, String author, BookInfo bookInfo) {
//		super();
//		this.title = title;
//		this.author = author;
//		this.bookInfo = bookInfo;
//	}
//
//	public Book(long id, String title, String author, BookInfo bookInfo) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.author = author;
//		this.bookInfo = bookInfo;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public BookInfo getBookInfo() {
//		return bookInfo;
//	}
//
//	public void setBookInfo(BookInfo bookInfo) {
//		this.bookInfo = bookInfo;
//	}
//
//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", bookInfo=" + bookInfo + "]";
//	}
//	
//	
	
}
