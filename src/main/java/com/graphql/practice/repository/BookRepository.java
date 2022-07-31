package com.graphql.practice.repository;

import com.graphql.practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, String> {

}
