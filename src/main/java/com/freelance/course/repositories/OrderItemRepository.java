package com.freelance.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.freelance.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long>{

}
