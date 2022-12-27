package com.spring.pharmacyApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.pharmacyApp.model.Produit;

public interface Produitrepo extends JpaRepository<Produit, Long>{

	@Query(value = "select * from Produit P, Famille F  where P.famille_id_famille = F.id_famille and  F.id_famille =:id",nativeQuery = true)
	public List<Produit> findProdByCat(@Param(value="id") Long id);
	@Query(value = "select * from Produit P, Laboratoire L where P.laboratoire_id_labo = L.id_labo and L.id_labo =:id",nativeQuery = true)
	public List<Produit> findProdByLabo(@Param(value="id") Long id);
	@Query(value = "select * from Produit P, Commande_produit C where P.cmdproduits_id_commande=C.id_commande and C.cmdfrns_id_fournisseur =:id ",nativeQuery = true)
	public List<Produit> findProdByFou(@Param(value="id") Long id);
	
}


