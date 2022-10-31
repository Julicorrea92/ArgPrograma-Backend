package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.SoftSkills;
import com.miPortfolioWeb.Springboot.repository.ISoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillsService implements ISoftSkillsService {
    
    @Autowired    
    public ISoftSkillsRepository softRepo;
    
    @Override
    public List<SoftSkills> verSoftSkills() {
        return softRepo.findAll();
        
    }
    
    @Override
    public void agregarSoftSkill(SoftSkills softSkill) {
        softRepo.save(softSkill);
    }
    
    @Override
    public void borrarSoftSkill(Long id) {
        softRepo.deleteById(id);
    }
    
    @Override
    public SoftSkills encontrarSoftSkill(Long id) {
        return softRepo.findById(id).orElse(null);
    }
    
}
