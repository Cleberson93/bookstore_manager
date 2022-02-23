package com.clebersonsilva.bookstoremanager.service;

import com.clebersonsilva.bookstoremanager.dto.MessageResponseDTO;
import com.clebersonsilva.bookstoremanager.entity.Book;
import com.clebersonsilva.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book saveBook =  bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + saveBook.getId())
                .build();
    }
}
