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
public class Famille implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
private Long Id_Famille;
private String Lib_Famille;
@OneToMany (mappedBy = ("famille"))
@JsonIgnore
private List <Produit> produits;
public Long getId_Famille() {
	return Id_Famille;
}
public void setId_Famille(Long id_Famille) {
	Id_Famille = id_Famille;
}
public String getLib_Famille() {
	return Lib_Famille;
}
public void setLib_Famille(String lib_Famille) {
	Lib_Famille = lib_Famille;
}
@Override
public String toString() {
	return "Famille [Id_Famille=" + Id_Famille + ", Lib_Famille=" + Lib_Famille + "]";
}
public Famille() {
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
