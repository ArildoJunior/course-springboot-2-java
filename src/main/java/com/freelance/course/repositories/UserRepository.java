package com.freelance.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.freelance.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
