package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.FormacionAcademica;
import com.miPortfolioWeb.Springboot.repository.IFormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {

    @Autowired
    public IFormacionRepository formRepo;

    @Override
    public List<FormacionAcademica> verFormacion() {
        return formRepo.findAll();
    }

    @Override
    public void agregarFormacion(FormacionAcademica formacion) {
        formRepo.save(formacion);
    }

    @Override
    public void borrarFormacion(Long id) {
        formRepo.deleteById(id);
    }

    @Override
    public FormacionAcademica encontrarFormacion(Long id) {
        return formRepo.findById(id).orElse(null);
    }

}
