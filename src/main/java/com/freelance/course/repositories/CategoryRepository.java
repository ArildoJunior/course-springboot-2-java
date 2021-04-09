package com.freelance.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.freelance.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long>{

}
