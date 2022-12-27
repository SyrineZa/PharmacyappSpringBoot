package com.spring.pharmacyApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pharmacyApp.model.Fournisseur;
import com.spring.pharmacyApp.repository.Fournisseurrepo;
import com.spring.pharmacyApp.service.FournisseurService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Fournisseur")
public class FournisseurController {

	@Autowired
	private FournisseurService fournisseurservice;
	@PostMapping ("/AddFrns")
	public Fournisseur AddFrns(@RequestBody Fournisseur frns)
	{
		fournisseurservice.ajouterFournisseur(frns);
		return frns ;
	}
	@DeleteMapping("/deleteFrns/{id}")
	public void deleteFrns(@PathVariable Long id){
		Fournisseur frnsExist ;
	    frnsExist=	fournisseurservice.FindById_Fournisseur(id);
		fournisseurservice.supprimerFournisseur(frnsExist);
		 
	}
	@PutMapping("/updateFrns/{id}")
	public ResponseEntity<?> updateFrns(@PathVariable Long id , @RequestBody Fournisseur frns)
	{
		Fournisseur FrnsExist = fournisseurservice.FindById_Fournisseur(id);
		System.out.println(FrnsExist.getId_fournisseur());
		FrnsExist.setNom_fournisseur(frns.getNom_fournisseur());
		FrnsExist.setAdresse_fournisseur(frns.getAdresse_fournisseur());
		FrnsExist.setEmail_fournisseur(frns.getEmail_fournisseur());
		FrnsExist.setTel_fournisseur(frns.getTel_fournisseur());
		Fournisseur savedFrns =  fournisseurservice.ajouterFournisseur(FrnsExist);
		
		return ResponseEntity.ok().body(savedFrns); 
	}
}
