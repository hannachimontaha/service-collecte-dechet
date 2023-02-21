package com.iset.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ramasseur {
	@Id
	@GeneratedValue
	private Integer ramasseurId;
	private String nom;
	private String prenom;
	private String adresse;
	private String numero_telephone;
	
	public Ramasseur(Integer ramasseurId, String nom, String prenom, String adresse, String numero_telephone) {
		super();
		this.ramasseurId = ramasseurId;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numero_telephone = numero_telephone;
	}
	public Ramasseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getRamasseurId() {
		return ramasseurId;
	}
	public void setRamasseurId(Integer ramasseurId) {
		this.ramasseurId = ramasseurId;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero_telephone() {
		return numero_telephone;
	}
	public void setNumero_telephone(String numero_telephone) {
		this.numero_telephone = numero_telephone;
	}
	
	

}
