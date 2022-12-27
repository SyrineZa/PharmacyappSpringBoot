package com.spring.pharmacyApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pharmacyApp.model.Produit;
import com.spring.pharmacyApp.service.ProduitService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Produit")
public class ProduitController {

	@Autowired
	private ProduitService prodservice;
	@PostMapping ("/AddProd")
	public Produit AddProd(@RequestBody Produit prod)
	{
		prodservice.ajouterProduit(prod);
		return prod ;
	}
	@PutMapping("/updateProd/{id}")
	public ResponseEntity<?> updateProd(@PathVariable Long id , @RequestBody Produit prod)
	{
		Produit prodExist = prodservice.FindById_Prod(id);
		System.out.println(prodExist.getId_prd());
		prodExist.setLib_prd(prod.getLib_prd());
		prodExist.setDescription_prd(prod.getDescription_prd());
		prodExist.setPrix_prd(prod.getPrix_prd());
		prodExist.setDateAjout_prd(prod.getDateAjout_prd());
		prodExist.setPrix_Livr(prod.getPrix_Livr());
		Produit savedprod =  prodservice.ajouterProduit(prodExist);
		
		return ResponseEntity.ok().body(savedprod); 
	}
	@GetMapping("/GetByIdProd/{id}")
	public Produit GetByIdProd(@PathVariable Long id) {
		return prodservice.FindById_Prod(id);
	}
	@GetMapping("/GetAllProd")
	public List<Produit>getAllProd(){
		return prodservice.listeProduit();
		
	}
	@GetMapping("/GetAllProdByFour/{id}")
	public List<Produit> getAllProdbyFour(@PathVariable Long id){
		return  prodservice.listeProduitFournisseur(id);
	}
	@GetMapping("/GetAllProdByCat/{id}")
	public List<Produit> getAllProdbyCat(@PathVariable Long id){
		return  prodservice.listeProduitCategorie(id);
	}
	@GetMapping("/GetAllProdByLabo/{id}")
	public List<Produit> getAllProdbyLabo(@PathVariable Long id){
		return  prodservice.listeProduitMarque(id);
	}
	
	
	
}
