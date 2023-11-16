package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private HashMap<Integer, Book> bookMap = new HashMap<>();

    @PostMapping("/add_book")
    public String addBook(@RequestBody Book book) {
        bookMap.put(book.getId(), book);
        return "Book added Successfully";
    }

    @GetMapping("/get_book_by_id")
    public List<Book> getBook() {
        return new ArrayList<>(bookMap.values());
    }
    @GetMapping("/list-of-books")
    public List<Book> getListOfBooks(){
        return new ArrayList<>(bookMap.values());
    }
}
