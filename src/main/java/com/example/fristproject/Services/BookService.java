package com.example.fristproject.Services;

import com.example.fristproject.Exceptions.BookAlreadyPresent;
import com.example.fristproject.Models.Book;
import com.example.fristproject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public void addBook(Book book) throws BookAlreadyPresent {
        Optional<Book> bookOptional = bookRepository.addBook(book);
        if(bookOptional.isEmpty())throw new BookAlreadyPresent("book already present");
    }
}
