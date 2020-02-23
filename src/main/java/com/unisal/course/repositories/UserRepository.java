package com.unisal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
