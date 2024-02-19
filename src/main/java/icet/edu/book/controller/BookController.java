package icet.edu.book.controller;

import icet.edu.book.dto.Book;
import icet.edu.book.entity.BookEntity;
import icet.edu.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    final BookService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
    @GetMapping("/get")
    public Iterable<BookEntity> getBooks(){
        return service.getBooks();
    }
}
