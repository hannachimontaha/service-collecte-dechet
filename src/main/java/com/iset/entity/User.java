package com.iset.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer userId;
	private String nom;
	private String prenom;
	private String email;
	private String numero_telephone;
	private String adresse;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String type;
	private String password;
	
	
	public User(Integer userId, String nom, String prenom, String email, String numero_telephone, String adresse,
			String type, String password) {
		super();
		this.userId = userId;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numero_telephone = numero_telephone;
		this.adresse = adresse;
		this.type = type;
		this.password = password;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero_telephone() {
		return numero_telephone;
	}
	public void setNumero_telephone(String numero_telephone) {
		this.numero_telephone = numero_telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

	
	
}
