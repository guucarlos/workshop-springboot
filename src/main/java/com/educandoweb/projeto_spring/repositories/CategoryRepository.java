package com.educandoweb.projeto_spring.repositories;

import com.educandoweb.projeto_spring.entities.Category;
import com.educandoweb.projeto_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
