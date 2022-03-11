package com.clebersonsilva.bookstoremanager.service;


import com.clebersonsilva.bookstoremanager.dto.BookDTO;
import com.clebersonsilva.bookstoremanager.dto.MessageResponseDTO;
import com.clebersonsilva.bookstoremanager.entity.Book;
import com.clebersonsilva.bookstoremanager.mapper.BookMapper;
import com.clebersonsilva.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder().
                message("Book created with ID " + savedBook.getId())
                .build();
    }

}
