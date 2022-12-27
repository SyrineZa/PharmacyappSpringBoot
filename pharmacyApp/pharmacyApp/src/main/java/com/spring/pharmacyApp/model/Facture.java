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
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
private Long Id_Fact_Achat;
private Date Date;
private double Total_HT;
private double Total_TVA;
private double Total_TTC;
@ManyToOne
private Fournisseur fournisseur;
@ManyToMany
@JsonIgnore
@JoinTable(name="facture_produits", joinColumns= @JoinColumn(name="facture_id"),inverseJoinColumns=@JoinColumn(name="produit_id"))//houni naarach ken lezem nekteb Id_Fact_Achat ouala aadi nkhaleha facture_id
private List <Produit> produits = new ArrayList<>();
public Long getId_Fact_Achat() {
	return Id_Fact_Achat;
}
public void setId_Fact_Achat(Long id_Fact_Achat) {
	Id_Fact_Achat = id_Fact_Achat;
}
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public double getTotal_HT() {
	return Total_HT;
}
public void setTotal_HT(double total_HT) {
	Total_HT = total_HT;
}
public double getTotal_TVA() {
	return Total_TVA;
}
public void setTotal_TVA(double total_TVA) {
	Total_TVA = total_TVA;
}
public double getTotal_TTC() {
	return Total_TTC;
}
public void setTotal_TTC(double total_TTC) {
	Total_TTC = total_TTC;
}
@Override
public String toString() {
	return "Facture [Id_Fact_Achat=" + Id_Fact_Achat + ", Date=" + Date + ", Total_HT=" + Total_HT + ", Total_TVA="
			+ Total_TVA + ", Total_TTC=" + Total_TTC + "]";
}
public Facture() {
	super();
	// TODO Auto-generated constructor stub
}
public Fournisseur getFournisseur() {
	return fournisseur;
}
public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}
public List <Produit> getProduits() {
	return produits;
}

}
