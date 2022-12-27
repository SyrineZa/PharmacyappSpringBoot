package com.spring.pharmacyApp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
@Entity
public class Fournisseur implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(nullable=false, updatable=false)
private Long id_fournisseur;
private String Nom_fournisseur;
private String Adresse_fournisseur;
private String Email_fournisseur;
private int Tel_fournisseur;
@OneToMany (mappedBy = ("fournisseur"),cascade=CascadeType.ALL)
private List <Facture> factures;
@ManyToOne
private Utilisateur utilisateur;
@OneToMany (mappedBy="cmdfrns",cascade=CascadeType.ALL)
@JsonIgnore
private List <Commande_produit> commande_produits;

public List<Commande_produit> getCommande_produits() {
	return commande_produits;
}
public void setCommande_produits(List<Commande_produit> commande_produits) {
	this.commande_produits = commande_produits;
}
public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId_fournisseur() {
	return id_fournisseur;
}
public void setId_fournisseur(Long id_fournisseur) {
	this.id_fournisseur = id_fournisseur;
}
public String getNom_fournisseur() {
	return Nom_fournisseur;
}
public void setNom_fournisseur(String nom_fournisseur) {
	Nom_fournisseur = nom_fournisseur;
}
public String getAdresse_fournisseur() {
	return Adresse_fournisseur;
}
public void setAdresse_fournisseur(String adresse_fournisseur) {
	Adresse_fournisseur = adresse_fournisseur;
}
public String getEmail_fournisseur() {
	return Email_fournisseur;
}
public void setEmail_fournisseur(String email_fournisseur) {
	Email_fournisseur = email_fournisseur;
}
public int getTel_fournisseur() {
	return Tel_fournisseur;
}
public void setTel_fournisseur(int tel_fournisseur) {
	Tel_fournisseur = tel_fournisseur;
}

@Override
public String toString() {
	return "Fournisseur [id_fournisseur=" + id_fournisseur + ", Nom_fournisseur=" + Nom_fournisseur
			+ ", Adresse_fournisseur=" + Adresse_fournisseur + ", Email_fournisseur=" + Email_fournisseur
			+ ", Tel_fournisseur=" + Tel_fournisseur + "]";
}
public List <Facture> getFactures() {
	return factures;
}
public void setFactures(List <Facture> factures) {
	this.factures = factures;
}
public Utilisateur getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}

}

