package com.projet3.hublo.controller;

import com.projet3.hublo.entity.Product;
import com.projet3.hublo.entity.User;
import com.projet3.hublo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/users")
    public List<User> getAll(){ return userRepository.findAll(); }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){ return userRepository.findById(id).get(); }
    @GetMapping("/users/cp{immatriculation}")
    public User getUser(@PathVariable String immatriculation){ return userRepository.findByImmatriculation(immatriculation); }
    @GetMapping( "/users/{userId}/favorites")
    public List<Product> getFavoriteProductByUser(@PathVariable Long userId){
        userRepository.findById(userId).get();
        return productRepository.findUser_FavoriteByUsersId(userId);}
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PostMapping   ("/users/{userId}/favorites/{productId}")
    public User addFavorite( @PathVariable Long userId,@PathVariable Long productId){
        User userWhoAdds = userRepository.findById(userId).get();
        Product productToAdd = productRepository.findById(productId).get();
        if(userWhoAdds.getProducts().contains(productToAdd)){
            return userWhoAdds;
        } else {
            userWhoAdds.getProducts().add(productToAdd);
            return userRepository.save(userWhoAdds);
        }}
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        User userToUpdate = userRepository.findById(id).get();
        userToUpdate.setFirstname(user.getFirstname());
        userToUpdate.setLastname(user.getLastname());
        userToUpdate.setImmatriculation(user.getImmatriculation());
        userToUpdate.setMail(user.getMail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setPhoneNumber(user.getPhoneNumber());
        userToUpdate.setDefaultStation(user.getDefaultStation());
        userToUpdate.setRole(user.getRole());
        userToUpdate.setPoste(user.getPoste());
        return userRepository.save(userToUpdate);
    }
    @DeleteMapping("users/{id}")
    public boolean deleteUserById(@PathVariable Long id){
        userRepository.deleteById(id);
        return true;
    }
    @DeleteMapping("/users/{userId}/favorites/{productId}")
        public User deleteFavorite(@PathVariable Long userId, @PathVariable Long productId){
        User userWhoDelete = userRepository.findById(userId).get();
        Product productToDelete = productRepository.findById(productId).get();
        userWhoDelete.getProducts().remove(productToDelete);
        return userRepository.save(userWhoDelete);}

}
