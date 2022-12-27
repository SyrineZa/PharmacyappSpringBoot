package com.spring.pharmacyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pharmacyApp.model.Famille;

public interface Famillerepo extends JpaRepository<Famille, Long>{

}
