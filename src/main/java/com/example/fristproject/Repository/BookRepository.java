package com.example.fristproject.Repository;

import com.example.fristproject.Models.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;
@Repository
public class BookRepository {
    private HashMap<Integer, Book> bookMap = new HashMap<>();
    public Optional<Book> addBook(Book book){
        if(!bookMap.containsKey(book.getId())){
            bookMap.put(book.getId(), book);
            return Optional.of(book);
        }
        return Optional.empty();
    }
}
