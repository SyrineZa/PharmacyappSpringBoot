package com.spring.pharmacyApp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pharmacyApp.model.Facture;
import com.spring.pharmacyApp.repository.facturerepo;

@Service
public class FactureService {
	@Autowired
	private facturerepo factureRepository;
	
	@Transactional
	public Facture SaveFac(Facture facture)
	{
		return factureRepository.save(facture);
	}
}
