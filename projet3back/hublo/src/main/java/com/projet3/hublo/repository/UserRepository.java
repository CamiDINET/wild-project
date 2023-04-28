package com.projet3.hublo.repository;

import com.projet3.hublo.entity.User;
import com.projet3.hublo.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
     User findByImmatriculation(String immatriculation);

}
