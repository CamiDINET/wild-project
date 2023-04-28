package com.projet3.hublo.controller;

import com.projet3.hublo.entity.Category;
import com.projet3.hublo.entity.Product;
import com.projet3.hublo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("products")
    public List<Product> getAllProducts(@RequestParam(required=false) Long categoryId){
        return productRepository.findAll();
    }
    @GetMapping("products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }
    @PostMapping("products/{categoryId}")
    public Product createProduct(@PathVariable Long categoryId, @RequestBody Product product){
        Category categoryToUse = categoryRepository.findById(categoryId).get();
        product.setCategory(categoryToUse);
        return productRepository.save(product);
    }
    @PutMapping("products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product productToUpdate = productRepository.findById(id).get();
        productToUpdate.setName(product.getName());
        productToUpdate.setPhoto(product.getPhoto());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setConditioning(product.getConditioning());
        productToUpdate.setReference(product.getReference());
        productToUpdate.setCategory(product.getCategory());
        return productRepository.save(productToUpdate);
    }
    @DeleteMapping("products/{id}")
    public boolean deleteProductById(@PathVariable Long id){
        productRepository.deleteById(id);
        return true;
    }

}
