package com.spring.pharmacyApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pharmacyApp.model.Famille;
import com.spring.pharmacyApp.service.FamilleService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Famille")
public class FamilleController {
@Autowired
private FamilleService familleservice; 
@GetMapping("/GetAllFam")
public List<Famille>GetAllFam(){
	return familleservice.listeFamille();
	
}
@PostMapping ("/AddFam")
public Famille AddFam(@RequestBody Famille fam)
{
	 familleservice.ajouterFamille(fam);
	return fam ;
}
@DeleteMapping("/deleteFam/{id}")
public String deleteFam(@PathVariable Long id)
{
	familleservice.supprimerFamille(id);
	return "Deleted" ; 
}
@PutMapping("/updateFam/{id}")
public ResponseEntity<?> updateFam(@PathVariable Long id , @RequestBody Famille famille)
{
	Famille FamilleExist = familleservice.FindById_Famille(id);
	System.out.println(FamilleExist.getId_Famille());
	FamilleExist.setLib_Famille(famille.getLib_Famille());
	Famille savedFamille =  familleservice.ajouterFamille(FamilleExist);
	
	return ResponseEntity.ok().body(savedFamille); 
}
}
