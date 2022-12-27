package com.spring.pharmacyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.*;
import com.spring.pharmacyApp.model.Fournisseur;
@RepositoryRestResource
public interface Fournisseurrepo extends JpaRepository<Fournisseur, Long> {

}
