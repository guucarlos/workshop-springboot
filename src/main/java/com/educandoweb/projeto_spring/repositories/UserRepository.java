package com.educandoweb.projeto_spring.repositories;

import com.educandoweb.projeto_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
