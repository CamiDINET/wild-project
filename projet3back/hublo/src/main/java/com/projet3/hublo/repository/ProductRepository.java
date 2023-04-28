package com.projet3.hublo.repository;

import com.projet3.hublo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findUser_FavoriteByUsersId(Long id);
}
