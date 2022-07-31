package com.graphql.practice.service.datafetcher;


import com.graphql.practice.model.Book;
import com.graphql.practice.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookDataFetcher implements DataFetcher<Optional<Book>> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Optional<Book> get(DataFetchingEnvironment environment) throws Exception {
        String id = environment.getArgument("id");
       return bookRepository.findById(id);
    }
}
