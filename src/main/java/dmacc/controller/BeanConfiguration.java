package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.BookInfo;
import dmacc.beans.Book;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
//		bean.setTitle("Department: 19");
//		bean.setAuthor("Will Hill");
//		bean.setGenre("Fiction");
//		bean.setPages(540);
		return bean;
	}
	
	@Bean
	public BookInfo bookInfo() {
		BookInfo bean = new BookInfo("Paper", "Fiction", 570);
		return bean;
	}
	
}
