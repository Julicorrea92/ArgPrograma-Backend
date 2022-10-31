package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Experiencia;
import com.miPortfolioWeb.Springboot.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public Experiencia encontrarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    //public Optional<Experiencia> getByPuesto(String puesto) {
    //    return expRepo.findByPuesto(puesto);
    //}

    @Override
    public void agregarExperiencia(Experiencia experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    //public boolean existsByPuesto(String puesto) {
    //    return expRepo.existsByPuesto(puesto);
    //}
    public Optional<Experiencia> getOne(Long id){
         return expRepo.findById(id);
    }
    public boolean existsById(Long id) {
        return expRepo.existsById(id);
    }
    
    //public Experiencia findExperiencia(Long id) {
    //    return expRepo.getById(id);
    //}
    
}
