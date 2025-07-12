package com.example.ecommercespring.controllers;
// package com.example.ecommercespring.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @GetMapping
    public String getCategories() {
        // This method will return a list of categories
        return "List of categories";
    }

    @PostMapping
    public String createCategory() {
        // This method will create a new category
        return "Category created";
    }

    @GetMapping("/count")
    public int getCategoryCount() {
        // This method will return the count of categories
        return 5;
    }


}
