package com.educandoweb.projeto_spring.services;

import com.educandoweb.projeto_spring.entities.Category;
import com.educandoweb.projeto_spring.entities.User;
import com.educandoweb.projeto_spring.repositories.CategoryRepository;
import com.educandoweb.projeto_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = repository.findById(id);
       return obj.get();
    }
}
