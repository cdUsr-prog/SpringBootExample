package com.application.book;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public interface BookRepository extends CrudRepository<BookEntity, Long> {

	void findById(BookEntity book);
}
