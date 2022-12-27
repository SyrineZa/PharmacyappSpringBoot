package com.spring.pharmacyApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pharmacyApp.model.Facture;
import com.spring.pharmacyApp.service.FactureService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Facture")
public class FactureController {
	@Autowired
	private FactureService factureservice;
	@PostMapping ("/AddFacture")
	public Facture AddFacture(@RequestBody Facture facture)
	{
		factureservice.SaveFac(facture);
		return facture ;
	}
}
