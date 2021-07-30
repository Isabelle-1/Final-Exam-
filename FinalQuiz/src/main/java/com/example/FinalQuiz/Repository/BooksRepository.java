package com.example.FinalQuiz.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.FinalQuiz.Entity.Books;





@Repository
public interface BooksRepository {

    int insertBooks(Books books);

    List<Books> getAllBooks();

    Books SelectById(int id);



}

