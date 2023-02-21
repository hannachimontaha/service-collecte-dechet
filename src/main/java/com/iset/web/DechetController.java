package com.iset.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iset.dao.DechetRepository;
import com.iset.dao.UserRepository;
import com.iset.entity.Dechet;
import com.iset.entity.User;

@RestController
public class DechetController {
	@Autowired
	DechetRepository dechetRepository;

	@GetMapping("/dechets")
	public List<Dechet> GetDechets() {
		return dechetRepository.findAll();

	}

	@GetMapping("/dechets/{id}")
	Optional<Dechet> GetDechetById(@PathVariable Integer id) {

		return dechetRepository.findById(id);

	}

	@PostMapping("/dechets")
	public Dechet AddDechet(@RequestBody Dechet dechet) {
		return dechetRepository.save(dechet);

	}

	@DeleteMapping("/dechets/{id}")
	void DeleteDechet(@PathVariable Integer id) {
		dechetRepository.deleteById(id);
	}

	@PutMapping("/dechets/{id}")
	Dechet UpdateDechet(@RequestBody Dechet newDechet, @PathVariable Integer id) {

		return dechetRepository.findById(id).map(dechet -> {
			dechet.setCategorie(newDechet.getCategorie());
			dechet.setAdresse_utilisateur(newDechet.getAdresse_utilisateur());
			dechet.setQuantite(newDechet.getQuantite());
			dechet.setPhoto(newDechet.getPhoto());
			return dechetRepository.save(dechet);
		}).orElseGet(() -> {
			newDechet.setDechetId(id);
			return dechetRepository.save(newDechet);
		});
	}
}
