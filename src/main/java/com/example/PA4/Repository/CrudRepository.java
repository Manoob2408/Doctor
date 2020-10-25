package com.example.PA4.Repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface CrudRepository<T, ID extends Serializable>
    extends Repository<T, ID> {
  
    <S extends T> S save(S entity);      
  
    Optional<T> findById(ID primaryKey); 
  
    Iterable<T> findAll();               
  
    long count();                        
  
    void delete(T entity);               
  
    boolean existsById(ID primaryKey);

}
