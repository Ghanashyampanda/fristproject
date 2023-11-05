package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class BookController {
    private final HashMap<Integer, Book> bookMap = new HashMap<>();

    @PostMapping("/add_book")
    public String addBook(@RequestBody Book book) {
        bookMap.put(book.getId(), book);
        return "Book added Successfully";
    }

    @GetMapping("/get_book")
    public List<Book> getBook() {
        return new ArrayList<>(bookMap.values());
    }
}
