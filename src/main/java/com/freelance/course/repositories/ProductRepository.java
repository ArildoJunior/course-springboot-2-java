package com.freelance.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.freelance.course.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long>{

}
