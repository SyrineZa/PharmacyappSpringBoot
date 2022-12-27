package com.spring.pharmacyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pharmacyApp.model.Commande_produit;

public interface Commande_produitrepo extends JpaRepository<Commande_produit, Long> {

}
