package com.spring.pharmacyApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pharmacyApp.model.Famille;
import com.spring.pharmacyApp.model.Laboratoire;
import com.spring.pharmacyApp.repository.Laboratoirerepo;

@Service
public class LaboratoireService {
	@Autowired
	private Laboratoirerepo laboratoireRepository;
	
	@Transactional
	public Laboratoire ajouterLaboratoire(Laboratoire laboratoire)
	{
		return laboratoireRepository.save(laboratoire);
	}
	
	@Transactional
	public List<Laboratoire> listeLaboratoire()
	{
		return laboratoireRepository.findAll();	
	}
	@Transactional
	public Laboratoire FindById_Lab(Long Id_Laboratoire)
	{
		return laboratoireRepository.findById(Id_Laboratoire).get();
	}
	
	@Transactional
	public void supprimerLaboratoire(Long id)
	{
		Laboratoire lab = laboratoireRepository.getOne(id);/*findById(id).get();*/
		laboratoireRepository.delete(lab);
	}
	
	
	public Laboratoire modifierLaboratoire(Laboratoire labo) {

		/*Laboratoire lab = laboratoireRepository.findById(id).get();
		laboratoireRepository.update(lab);*/
		return laboratoireRepository.save(labo);
	}
}
