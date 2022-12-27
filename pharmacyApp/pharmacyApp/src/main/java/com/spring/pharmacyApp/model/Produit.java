package com.spring.pharmacyApp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Produit implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(nullable=false, updatable=false)
private Long Id_prd;
private String Lib_prd;
private String Description_prd;
private Double Prix_prd;
private Date DateAjout_prd;
private Float Prix_Livr;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@ManyToOne(fetch = FetchType.LAZY, optional = false)
private Famille famille;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@ManyToOne (fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "Id_Labo",referencedColumnName = "Id_Labo")
private Laboratoire laboratoire;
@OneToMany (mappedBy="cmdproduits")
@JsonIgnore
private List <Commande_produit> commande_produits;
public List<Commande_produit> getCommande_produits() {
	return commande_produits;
}
public void setCommande_produits(List<Commande_produit> commande_produits) {
	this.commande_produits = commande_produits;
}
@ManyToMany (mappedBy="produits")
@JsonIgnore
private List <Facture> factures = new ArrayList<>();
@ManyToMany
@JoinTable(name="produits_utilisateurs", joinColumns= @JoinColumn(name="produit_id"),inverseJoinColumns=@JoinColumn(name="utilisateur_id"))//houni naarach ken lezem nekteb Id_Fact_Achat ouala aadi nkhaleha facture_id
@JsonIgnore
private List <Utilisateur> utilisateurs = new ArrayList<>();
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId_prd() {
	return Id_prd;
}
public void setId_prd(Long id_prd) {
	Id_prd = id_prd;
}
public String getLib_prd() {
	return Lib_prd;
}
public void setLib_prd(String lib_prd) {
	Lib_prd = lib_prd;
}
public String getDescription_prd() {
	return Description_prd;
}
public void setDescription_prd(String description_prd) {
	Description_prd = description_prd;
}
public Double getPrix_prd() {
	return Prix_prd;
}
public void setPrix_prd(Double prix_prd) {
	Prix_prd = prix_prd;
}
public Date getDateAjout_prd() {
	return DateAjout_prd;
}
public void setDateAjout_prd(Date dateAjout_prd) {
	DateAjout_prd = dateAjout_prd;
}
public Float getPrix_Livr() {
	return Prix_Livr;
}
public void setPrix_Livr(Float prix_Livr) {
	Prix_Livr = prix_Livr;
}

@Override
public String toString() {
	return "Produit [Id_prd=" + Id_prd + ", Lib_prd=" + Lib_prd + ", Description_prd=" + Description_prd + ", Prix_prd="
			+ Prix_prd + ", DateAjout_prd=" + DateAjout_prd + ", Prix_Livr=" + Prix_Livr + "]";
}
public Famille getFamille() {
	return famille;
}
public void setFamille(Famille famille) {
	this.famille = famille;
}
public Laboratoire getLaboratoire() {
	return laboratoire;
}
public void setLaboratoire(Laboratoire laboratoire) {
	this.laboratoire = laboratoire;
}
public List <Facture> getFactures() {
	return factures;
}
public List <Utilisateur> getUtilisateurs() {
	return utilisateurs;
}
public Produit(Long id_prd, String lib_prd, String description_prd, Double prix_prd, Date dateAjout_prd,
		Float prix_Livr) {
	super();
	Id_prd = id_prd;
	Lib_prd = lib_prd;
	Description_prd = description_prd;
	Prix_prd = prix_prd;
	DateAjout_prd = dateAjout_prd;
	Prix_Livr = prix_Livr;
}

}
