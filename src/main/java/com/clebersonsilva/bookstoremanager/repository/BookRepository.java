package com.clebersonsilva.bookstoremanager.repository;

import com.clebersonsilva.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
