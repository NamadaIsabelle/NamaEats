package com.namaeats.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namaeats.model.MenuItem;

// This interface gives you CRUD methods for MenuItem automatically
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
