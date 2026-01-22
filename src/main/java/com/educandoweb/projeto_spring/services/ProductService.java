package com.educandoweb.projeto_spring.services;

import com.educandoweb.projeto_spring.entities.Product;
import com.educandoweb.projeto_spring.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();
    }
}
