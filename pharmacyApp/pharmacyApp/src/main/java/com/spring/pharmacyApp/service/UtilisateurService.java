package com.spring.pharmacyApp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.pharmacyApp.model.Utilisateur;
import com.spring.pharmacyApp.repository.utilisateurrepo;
@Service
public class UtilisateurService {
	@Autowired
	private utilisateurrepo utilisateurRepository;
	
	@Transactional
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur)
	{
		return utilisateurRepository.save(utilisateur);
	}
	@Transactional
	public Utilisateur FindById_Utilisateur(Long Id_Util)
	{
		return utilisateurRepository.findById(Id_Util).get();
	}

	@Transactional
	public void supprimerUtilisateur(Long id)
	{
		Utilisateur util = utilisateurRepository.findById(id).get();
		utilisateurRepository.delete(util);
	}
	
	
	public Utilisateur modifierUtilisateur(Utilisateur util) {

		/*Utilisateur util = utilisateurRepository.findById(id).get();
		utilisateurRepository.update(util);*/
		return utilisateurRepository.save(util);
	}
}
