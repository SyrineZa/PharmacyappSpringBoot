package com.spring.pharmacyApp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande_produit implements Serializable {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
	private Long Id_commande;
	private int QuantitéFournie;
	private Date DateFournie;
	
	@ManyToOne
	private Produit cmdproduits;
	@ManyToOne
	private Fournisseur cmdfrns;
    public Fournisseur getCmdfrns() {
		return cmdfrns;
	}
	public void setCmdfrns(Fournisseur cmdfrns) {
		this.cmdfrns = cmdfrns;
	}
	public Produit getCmdproduits() {
		return cmdproduits;
	}
	public void setCmdproduits(Produit cmdproduits) {
		this.cmdproduits = cmdproduits;
	}
	public Long getId_commande() {
		return Id_commande;
	}
	public void setId_commande(Long id_commande) {
		Id_commande = id_commande;
	}
	public int getQuantitéFournie() {
		return QuantitéFournie;
	}
	public void setQuantitéFournie(int quantitéFournie) {
		QuantitéFournie = quantitéFournie;
	}
	public Date getDateFournie() {
		return DateFournie;
	}
	public void setDateFournie(Date dateFournie) {
		DateFournie = dateFournie;
	}
	public Commande_produit(Long id_commande, int quantitéFournie, Date dateFournie) {
		super();
		Id_commande = id_commande;
		QuantitéFournie = quantitéFournie;
		DateFournie = dateFournie;
	}
	public Commande_produit() {
		super();
		// TODO Auto-generated constructor stub
	} 
}
