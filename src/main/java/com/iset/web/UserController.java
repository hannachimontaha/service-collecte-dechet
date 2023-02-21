package com.iset.web;

import java.util.List;
import java.util.Optional;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iset.dao.UserRepository;
import com.iset.entity.User;


@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	
	@GetMapping("/users")
	public List<User> GetUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public User AddUser(@RequestBody User user){
	return userRepository.save(user);
	
	}
	
	 @GetMapping("/users/{id}")
	 Optional<User> GetUserById(@PathVariable Integer id) {
	    
	    return userRepository.findById(id);
	     
	  }

	  @PutMapping("/users/{id}")
	  User UpdateUser(@RequestBody User newUser, @PathVariable Integer id) {
	    
	    return userRepository.findById(id)
	      .map(user -> {
	        user.setNom(newUser.getNom());
	        user.setPrenom(newUser.getPrenom());
	        user.setEmail(newUser.getEmail());
	        user.setNumero_telephone(newUser.getNumero_telephone());
	        user.setAdresse(newUser.getAdresse());
	        user.setType(newUser.getType());
	        user.setPassword(newUser.getPassword());
	        return userRepository.save(user);
	      })
	      .orElseGet(() -> {
	        newUser.setUserId(id);
	        return userRepository.save(newUser);
	      });
	  }
	 
	  @DeleteMapping("/users/{id}")
	  void DeleteUser(@PathVariable Integer id) {
		  userRepository.deleteById(id);
	  }
	
	
}
