package com.spring.pharmacyApp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Laboratoire implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
private Long Id_Labo;
private String Lib_labo;
@JsonIgnore
@OneToMany (mappedBy = ("laboratoire"))
private List <Produit> produits;
public Long getId_Labo() {
	return Id_Labo;
}
public void setId_Labo(Long id_Labo) {
	Id_Labo = id_Labo;
}
public String getLib_labo() {
	return Lib_labo;
}
public void setLib_labo(String lib_labo) {
	Lib_labo = lib_labo;
}
@Override
public String toString() {
	return "Laboratoire [Id_Labo=" + Id_Labo + ", Lib_labo=" + Lib_labo + "]";
}
public Laboratoire() {
	super();
	// TODO Auto-generated constructor stub
}
public List <Produit> getProduits() {
	return produits;
}
public void setProduits(List <Produit> produits) {
	this.produits = produits;
}

}
