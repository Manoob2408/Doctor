package com.example.PA4.Repository;

import com.example.PA4.Entidade.Medicamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedRepository extends JpaRepository <Medicamento, Integer> {
    
}
