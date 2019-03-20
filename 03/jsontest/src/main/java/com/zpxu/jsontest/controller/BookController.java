package com.zpxu.jsontest.controller;

import com.zpxu.jsontest.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @RequestMapping("/findBook")
    public Book findBook(Book book){
        System.out.println(book);
        book.setAuthor("肖文吉");
        book.setImage("SpringMyBatis.jpg");
        book.setPrice(58.0);
        book.setRemark("媲美于SSH组合的轻量级Java EE应用开发方式");
        return book;
    }


    @RequestMapping("/findBooks")
    public List<Book> findBooks(){
        // 创建集合
        List<Book> books = new ArrayList<Book>();
        // 添加图书对象
        books.add(new Book(1,"疯狂Java讲义","李刚","java.jpg",109.0));
        books.add(new Book(2,"轻量级JavaEE企业应用实战","李刚","ee.jpg",108.0));
        books.add(new Book(3,"Spring MVC企业应用实战","肖文吉","SpringMyBatis.jpg",58.0));
        books.add(new Book(4,"疯狂Android讲义","李刚","android.jpg",108.0));
        books.add(new Book(5,"疯狂Ajax开发","李刚","ajax.jpg",79.0));
        // 返回集合
        return books;
    }
}
