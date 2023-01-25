package com.educandoweb.course.repository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoyRepository extends JpaRepository<Category, Long> {



}
