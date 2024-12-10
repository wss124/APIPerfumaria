package com.perfumaria.APIPerfumaria.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perfumaria.APIPerfumaria.entity.Perfume;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Long> {

    
}