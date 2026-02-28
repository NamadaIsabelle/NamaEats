package com.namaeats.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namaeats.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
