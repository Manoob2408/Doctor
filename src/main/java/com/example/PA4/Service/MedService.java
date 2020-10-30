package com.example.PA4.Service;

import java.util.List;

import com.example.PA4.Entidade.Medicamento;
import com.example.PA4.Repository.MedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedService {
    
    @Autowired
    private MedRepository repository;

    public List<Medicamento> getMeds()
    {
        return repository.findAll();
    }

}
