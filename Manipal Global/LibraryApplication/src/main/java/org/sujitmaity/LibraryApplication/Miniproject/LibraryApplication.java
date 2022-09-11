package org.sujitmaity.LibraryApplication.Miniproject;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.sujitmaity.LibraryApplication.Miniproject.BookClacc.BookClass;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
		//
		//		BookClass book = new BookClass();
		//		book.setBookId(101);
		//		book.setTitle("Maths");
		//		book.setAuthorName("Sujit");
		//		book.setYearOfPublish(2022);
		//
		//		RestTemplate temp = new RestTemplate();
		//
		//		//		ResponseEntity<BookClass> boo= temp.getForEntity("http://localhost:8080/bookclass/get/102", BookClass.class);
		//		//		System.out.println("Niklo Tum:"+boo);
		//
		//
		//		HttpEntity<BookClass> boo= new HttpEntity<BookClass>(book);
		//		System.out.println("AAja Bhai: "+boo);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("org.sujitmaity.LibraryApplication.Miniproject.BookController")).build();

	}
	@Bean
	public InternalResourceViewResolver defaultViewResolver() {
		return new InternalResourceViewResolver();
	}

}
