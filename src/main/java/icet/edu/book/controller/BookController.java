package icet.edu.book.controller;

import icet.edu.book.dto.Book;
import icet.edu.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService service;
    @PostMapping
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
}
