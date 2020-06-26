package com.marlabs.bala;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface BookRepository extends JpaRepository<Book, Long>{

}
