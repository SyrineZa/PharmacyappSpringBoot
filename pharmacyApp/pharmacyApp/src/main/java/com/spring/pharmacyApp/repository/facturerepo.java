package com.spring.pharmacyApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pharmacyApp.model.Facture;

public interface facturerepo extends JpaRepository<Facture, Long>{

}
