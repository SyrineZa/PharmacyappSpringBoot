package com.spring.pharmacyApp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pharmacyApp.model.Famille;
import com.spring.pharmacyApp.repository.Famillerepo;

@Service
public class FamilleService {
	@Autowired
	private Famillerepo famillerepo;
	
	
	@Transactional
	public Famille ajouterFamille(Famille famille)
	{
		return famillerepo.save(famille);
	}
	@Transactional
	public Famille FindById_Famille(Long Id_Famille)
	{
		return famillerepo.findById(Id_Famille).get();
	}

	@Transactional
	public void supprimerFamille(Long id)
	{
		Famille fam = famillerepo.findById(id).get();
		famillerepo.delete(fam);
	}
	@Transactional
	public List<Famille> listeFamille(){
		return famillerepo.findAll();
	 }
	public Famille modifierFamille(Famille fam) {
		/*Famille fam = famillerepo.findById(Id).get();
		famillerepo.update(fam);*/
		return famillerepo.save(fam);
	}
}
