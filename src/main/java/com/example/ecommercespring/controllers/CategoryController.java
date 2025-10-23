package com.example.ecommercespring.controllers;
import com.example.ecommercespring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<String> getAllCategories() {
        return this.categoryService.getAllCategories();
    }

}
