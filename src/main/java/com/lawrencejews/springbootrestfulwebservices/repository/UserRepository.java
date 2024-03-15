package com.lawrencejews.springbootrestfulwebservices.repository;

import com.lawrencejews.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
