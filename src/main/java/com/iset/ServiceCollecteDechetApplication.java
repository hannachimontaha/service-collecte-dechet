package com.iset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.dao.DechetRepository;
import com.iset.dao.RamasseurRepository;
import com.iset.dao.UserRepository;
import com.iset.entity.Dechet;
import com.iset.entity.Ramasseur;
import com.iset.entity.User;

@SpringBootApplication
public class ServiceCollecteDechetApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	DechetRepository dechetRepository;
	@Autowired
	RamasseurRepository ramasseurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceCollecteDechetApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		User user1=userRepository.save(new User(1,"El Aoueyni","Rania","rania@gmail.com","23872822","Tabarka Jendouba","donneur","12345678"));
		User user2=userRepository.save(new User(2,"Hannachi","Montaha","montaha@gmail.com","55555555","Bousalem Jendouba","donneur","12345678"));
		User user3=userRepository.save(new User(3,"Fatnassi","Mariem","mariem@gmail.com","22222222","Mateur Bizerte","donneur","12345678"));	
		User user4=userRepository.save(new User(4,"Ghazouani","Eya","eya@gmail.com","99999999","Jendouba","donneur","12345678"));			

		Dechet dechet1=dechetRepository.save(new Dechet(1,"Pastiques","bousalem","2kg","photo.png"));
		Dechet dechet2=dechetRepository.save(new Dechet(2,"Electroniques","tabarka","10kg","22222222.jpeg"));	
		Dechet dechet3=dechetRepository.save(new Dechet(3,"Papiers","jendouba","3kg","99999999.png"));			

		Ramasseur ram1=ramasseurRepository.save(new Ramasseur(1,"hannachi","montehe","bousalem","54424941"));
	}

}
