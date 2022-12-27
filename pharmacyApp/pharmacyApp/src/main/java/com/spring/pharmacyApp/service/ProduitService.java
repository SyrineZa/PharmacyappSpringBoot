package com.spring.pharmacyApp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pharmacyApp.model.Produit;
import com.spring.pharmacyApp.repository.Produitrepo;

@Service
public class ProduitService {
	@Autowired
	private Produitrepo produitRepository;
	
	@Transactional
	public Produit ajouterProduit(Produit produit)
	{
		return produitRepository.save(produit);
	}
	
	@Transactional
	public List<Produit> listeProduitFournisseur(Long id)
	{
		return produitRepository.findProdByFou(id);
	}
	@Transactional
	public Produit FindById_Prod(Long Id_prd)
	{
		return produitRepository.findById(Id_prd).get();
	}
	
	@Transactional
	public Optional<Produit> consulterFicheProduit(Long id)
	{
		return produitRepository.findById(id);
	}

        @Transactional
	public List<Produit> listeProduit()
	{
		return produitRepository.findAll();
	}

	@Transactional
	public List<Produit> listeProduitMarque(Long id)
	{
		return produitRepository.findProdByLabo(id);
	}

        @Transactional
	public List<Produit> listeProduitCategorie(Long id)
	{
		return produitRepository.findProdByCat(id); /*ena badalt findProdByCat(id)*/
    }
        public Produit modifierProduit(Produit produit) {

        	
        	return produitRepository.save(produit);
    	}
}
