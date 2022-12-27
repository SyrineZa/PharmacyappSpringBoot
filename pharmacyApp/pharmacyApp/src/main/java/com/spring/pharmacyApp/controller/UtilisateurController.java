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

import com.spring.pharmacyApp.model.Utilisateur;
import com.spring.pharmacyApp.service.UtilisateurService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurservice;
	@PostMapping ("/AddUtil")
	public Utilisateur AddUtil(@RequestBody Utilisateur util)
	{
		utilisateurservice.ajouterUtilisateur(util);
		return util ;
	}
	@DeleteMapping("/deleteUtil/{id}")
	public String deleteUtil(@PathVariable Long id)
	{
		utilisateurservice.supprimerUtilisateur(id);
		return "Deleted" ; 
	}
	@PutMapping("/updateUtil/{id}")
	public ResponseEntity<?> updateUtil(@PathVariable Long id , @RequestBody Utilisateur util)
	{
		Utilisateur UtilExist = utilisateurservice.FindById_Utilisateur(id);
		System.out.println(UtilExist.getId_util());
		UtilExist.setNom_util(util.getNom_util());
		UtilExist.setPrenom_util(util.getPrenom_util());
		UtilExist.setAdresse_util(util.getAdresse_util());
		UtilExist.setEmail_util(util.getEmail_util());
		UtilExist.setCodePostal_util(util.getCodePostal_util());
		UtilExist.setDateNaissance_util(util.getDateNaissance_util());
		Utilisateur savedUtil =  utilisateurservice.ajouterUtilisateur(UtilExist);
		
		return ResponseEntity.ok().body(savedUtil); 
	}
}
