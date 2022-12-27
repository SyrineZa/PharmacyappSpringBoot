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

import com.spring.pharmacyApp.model.Laboratoire;
import com.spring.pharmacyApp.service.LaboratoireService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Laboratoire")
public class LaboratoireController {
	@Autowired
	private LaboratoireService laboratoireservice; 
	@GetMapping("/GetAllLab")
	public List<Laboratoire>GetAllLab(){
		return laboratoireservice.listeLaboratoire();
		
	}
	@PostMapping ("/AddLab")
	public Laboratoire AddLab(@RequestBody Laboratoire lab)
	{
		 laboratoireservice.ajouterLaboratoire(lab);
		return lab ;
	}
	@DeleteMapping("/deleteLab/{id}")
	public void deleteLab(@PathVariable Long id)
	{
		laboratoireservice.supprimerLaboratoire(id);
		
	}
	@PutMapping("/updateLab/{id}")
	public ResponseEntity<?> updateLab(@PathVariable Long id , @RequestBody Laboratoire labo)
	{
		Laboratoire LabExist = laboratoireservice.FindById_Lab(id);
		System.out.println(LabExist.getId_Labo());
		LabExist.setLib_labo(labo.getLib_labo());
		Laboratoire savedLab =  laboratoireservice.ajouterLaboratoire(LabExist);
		
		return ResponseEntity.ok().body(savedLab); 
	}
}
