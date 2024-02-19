package icet.edu.book.service;

import icet.edu.book.dto.Book;
import icet.edu.book.entity.BookEntity;

public interface BookService {
    void addBook(Book book);
    Iterable<BookEntity> getBooks();
    boolean deleteBook(Long id);
    Book getBookId(Long id);
}
