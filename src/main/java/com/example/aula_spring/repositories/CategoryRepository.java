package com.example.aula_spring.repositories;

import com.example.aula_spring.entities.Category;
import com.example.aula_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
