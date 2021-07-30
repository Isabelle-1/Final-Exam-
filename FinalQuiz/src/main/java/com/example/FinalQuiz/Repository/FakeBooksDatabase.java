package com.example.FinalQuiz.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.FinalQuiz.Entity.Books;





@Repository
public class FakeBooksDatabase implements BooksRepository{

    private static List<Books> BOOKSDATA = new ArrayList<>();


    @Override
    public int insertBooks(Books books) {
        BOOKSDATA.add(new Books(books.getId(), books.getName()));
        return 1;
    }



    @Override
    public List<Books> getAllBooks() {
        return BOOKSDATA;
    }



    @Override
    public Books SelectById(int id) {

        Books found = null;

        for(Books books : BOOKSDATA){
            if(books.getId() == id){
                found = books;
            }
        }

        return found;
    }


}
