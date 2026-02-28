package com.namaeats.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namaeats.model.MenuItem;
import com.namaeats.repository.MenuItemRepository;

@RestController
@RequestMapping("/menu")
public class MenuItemController {

    private final MenuItemRepository menuItemRepository;

    // Constructor injection
    public MenuItemController(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    // GET: fetch all menu items
    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    // POST: add a new menu item
    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }
}
