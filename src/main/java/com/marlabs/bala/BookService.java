package com.marlabs.bala;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookService {
	
   

    @Autowired
    private BookRepository repository;
    
    public List<Book> listAll() {
		return repository.findAll();
	}
    
	public void save(Book product) {
		repository.save(product);
	}
	
	public Book get(long id) {
		return repository.findById(id).get();
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}

}
