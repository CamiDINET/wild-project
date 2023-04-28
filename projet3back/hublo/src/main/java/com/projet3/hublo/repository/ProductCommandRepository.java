package com.projet3.hublo.repository;

import com.projet3.hublo.entity.Product;
import com.projet3.hublo.entity.ProductCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommandRepository extends JpaRepository<ProductCommand, Long> {
    //List<Product> findByCategoryId(Long categoryId);
}
