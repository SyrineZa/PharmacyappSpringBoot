package com.spring.pharmacyApp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pharmacyApp.model.Fournisseur;

import com.spring.pharmacyApp.repository.Fournisseurrepo;

@Service
public class FournisseurService {
@Autowired
private Fournisseurrepo fournisseurrepo;

@Transactional
public Optional<Fournisseur>consulterFournisseur(long id) {
	return fournisseurrepo.findById(id);
}
@Transactional
public Fournisseur ajouterFournisseur(Fournisseur fournisseur)
{
	return fournisseurrepo.save(fournisseur);
}
@Transactional
public Fournisseur FindById_Fournisseur(Long Id_fournisseur)
{
	return fournisseurrepo.findById(Id_fournisseur).get();
}
	

@Transactional
public void supprimerFournisseur(Fournisseur frns)
{
	fournisseurrepo.delete(frns);
}
@Transactional
public Fournisseur modifierFournisseur(Fournisseur frns) {
	/*Fournisseur frns = fournisseurrepo.findById(Id).get();
	fournisseurrepo.update(frns);*/
	return fournisseurrepo.save(frns);
}

}
