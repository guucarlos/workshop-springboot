package com.educandoweb.projeto_spring.repositories;

import com.educandoweb.projeto_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
