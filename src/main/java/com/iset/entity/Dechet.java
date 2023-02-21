package com.iset.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dechet {

	@Id
	@GeneratedValue
	private Integer dechetId;
	private String categorie;
	private String adresse_utilisateur;
	private String quantite;
	private String photo;
	
	
	public Dechet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dechet(Integer dechetId, String categorie, String adresse_utilisateur, String quantite, String photo) {
		super();
		this.dechetId = dechetId;
		this.categorie = categorie;
		this.adresse_utilisateur = adresse_utilisateur;
		this.quantite = quantite;
		this.photo = photo;
	}
	public Integer getDechetId() {
		return dechetId;
	}
	public void setDechetId(Integer dechetId) {
		this.dechetId = dechetId;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAdresse_utilisateur() {
		return adresse_utilisateur;
	}
	public void setAdresse_utilisateur(String adresse_utilisateur) {
		this.adresse_utilisateur = adresse_utilisateur;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
