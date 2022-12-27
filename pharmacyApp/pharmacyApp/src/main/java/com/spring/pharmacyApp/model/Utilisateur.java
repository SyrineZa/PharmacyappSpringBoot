package com.spring.pharmacyApp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
private Long Id_util;
private String Nom_util;
private String Prenom_util;
private String Adresse_util;
private String Email_util;
private int CodePostal_util;
private Date DateNaissance_util;
@OneToMany (mappedBy = ("utilisateur"))
@JsonIgnore
private List <Fournisseur> fournisseurs;
@ManyToMany (mappedBy="utilisateurs")
@JsonIgnore
private List <Produit> produits = new ArrayList<>();
public Long getId_util() {
	return Id_util;
}
public void setId_util(Long id_util) {
	Id_util = id_util;
}
public String getNom_util() {
	return Nom_util;
}
public void setNom_util(String nom_util) {
	Nom_util = nom_util;
}
public String getPrenom_util() {
	return Prenom_util;
}
public void setPrenom_util(String prenom_util) {
	Prenom_util = prenom_util;
}
public String getAdresse_util() {
	return Adresse_util;
}
public void setAdresse_util(String adresse_util) {
	Adresse_util = adresse_util;
}
public String getEmail_util() {
	return Email_util;
}
public void setEmail_util(String email_util) {
	Email_util = email_util;
}
public int getCodePostal_util() {
	return CodePostal_util;
}
public void setCodePostal_util(int codePostal_util) {
	CodePostal_util = codePostal_util;
}
public Date getDateNaissance_util() {
	return DateNaissance_util;
}
public void setDateNaissance_util(Date dateNaissance_util) {
	DateNaissance_util = dateNaissance_util;
}
@Override
public String toString() {
	return "Utilisateur [Id_util=" + Id_util + ", Nom_util=" + Nom_util + ", Prenom_util=" + Prenom_util
			+ ", Adresse_util=" + Adresse_util + ", Email_util=" + Email_util + ", CodePostal_util=" + CodePostal_util
			+ ", DateNaissance_util=" + DateNaissance_util + "]";
}
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public List <Fournisseur> getFournisseurs() {
	return fournisseurs;
}
public void setFournisseurs(List <Fournisseur> fournisseurs) {
	this.fournisseurs = fournisseurs;
}
public List <Produit> getProduits() {
	return produits;
} 

}
