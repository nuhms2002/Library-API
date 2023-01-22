package com.example.Nuh_demo.Service;

import com.example.Nuh_demo.Model.Book;
import com.example.Nuh_demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public Collection<Book> getAllBook() {
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(@PathVariable Integer id) {
        return bookRepository.findById(id);
    }
    public String insertBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Book Succesfully Inserted";
    }
    public String deleteBook(@PathVariable Integer id) {
        bookRepository.deleteById(id);
        return "Book Succesfully Deleted";
    }
}
