package com.educandoweb.course.repository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.OrderItem;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
