package com.freelance.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.freelance.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{

}
