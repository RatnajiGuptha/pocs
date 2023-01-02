package com.springDataJpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.Domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
