package com.example.FinalQuiz.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalQuiz.Entity.Books;
import com.example.FinalQuiz.Service.BooksService;



@RequestMapping("api/v1/books")
@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping
    public void addNewStudent(@RequestBody Books books){
        booksService.addBooks(books);
    }

    @GetMapping
    public List<Books> returnAllStudents(){
        return booksService.findAllBooks();
    }

    @GetMapping(path = "{id}")
    public Books getBooksByID(@PathVariable("id") int id){
        return booksService.getBooksByID(id);
    }
}