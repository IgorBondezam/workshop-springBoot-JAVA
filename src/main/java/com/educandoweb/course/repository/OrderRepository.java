package com.educandoweb.course.repository;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {



}
