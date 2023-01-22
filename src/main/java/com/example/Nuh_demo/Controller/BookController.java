package com.example.Nuh_demo.Controller;

import com.example.Nuh_demo.Model.Book;
import com.example.Nuh_demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public Collection<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBookByID(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }
    @PostMapping("/book")
    public String insertBook(@RequestBody Book book) {
        return bookService.insertBook(book);
    }

    @DeleteMapping("/book/{id}")
    public String insertBook(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }

}

