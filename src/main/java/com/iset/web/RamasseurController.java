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
import com.iset.dao.RamasseurRepository;
import com.iset.entity.Dechet;
import com.iset.entity.Ramasseur;

@RestController
public class RamasseurController {
	@Autowired
	RamasseurRepository ramasseurRepository;

	@GetMapping("/ramasseurs")
	public List<Ramasseur> GetRamasseurs() {
		return ramasseurRepository.findAll();

	}

	@GetMapping("/ramasseurs/{id}")
	Optional<Ramasseur> GetRamasseurById(@PathVariable Integer id) {

		return ramasseurRepository.findById(id);

	}

	@PostMapping("/ramasseurs")
	public Ramasseur AddRamasseur(@RequestBody Ramasseur ramasseur) {
		return ramasseurRepository.save(ramasseur);

	}

	@DeleteMapping("/ramasseurs/{id}")
	void DeleteRamasseur(@PathVariable Integer id) {
		ramasseurRepository.deleteById(id);
	}

	@PutMapping("/ramasseurs/{id}")
	Ramasseur UpdateRamasseur(@RequestBody Ramasseur newRamasseur, @PathVariable Integer id) {

		return ramasseurRepository.findById(id).map(ramasseur -> {
			ramasseur.setNom(newRamasseur.getNom());
			ramasseur.setPrenom(newRamasseur.getPrenom());
			ramasseur.setAdresse(newRamasseur.getAdresse());
			ramasseur.setNumero_telephone(newRamasseur.getNumero_telephone());
			return ramasseurRepository.save(ramasseur);
		}).orElseGet(() -> {
			newRamasseur.setRamasseurId(id);
			return ramasseurRepository.save(newRamasseur);
		});
	}

}
