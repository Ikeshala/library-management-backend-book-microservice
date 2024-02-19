package icet.edu.book.service.impl;

import icet.edu.book.dto.Book;
import icet.edu.book.entity.BookEntity;
import icet.edu.book.repository.BookRepository;
import icet.edu.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    final BookRepository repository;
    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addBook(Book book) {
        BookEntity entity = mapper.map(book, BookEntity.class);
        repository.save(entity);
    }

    @Override
    public Iterable<BookEntity> getBooks() {
        return repository.findAll();
    }
}
