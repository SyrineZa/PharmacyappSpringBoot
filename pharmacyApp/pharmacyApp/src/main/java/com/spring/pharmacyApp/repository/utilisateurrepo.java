package com.spring.pharmacyApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pharmacyApp.model.Utilisateur;

public interface utilisateurrepo extends JpaRepository<Utilisateur, Long>{

}
