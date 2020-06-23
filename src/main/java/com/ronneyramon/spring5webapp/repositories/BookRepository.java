package com.ronneyramon.spring5webapp.repositories;

import com.ronneyramon.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
