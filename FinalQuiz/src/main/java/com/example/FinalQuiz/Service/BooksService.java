package com.example.FinalQuiz.Service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalQuiz.Entity.Books;
import com.example.FinalQuiz.Repository.BooksRepository;



@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public int addBooks(Books books){
        return booksRepository.insertBooks(books);
    }

    public List<Books> findAllBooks(){
        return booksRepository.getAllBooks();
    }

    public Books getBooksByID(int id){
        return booksRepository.SelectById(id);
    }
}
