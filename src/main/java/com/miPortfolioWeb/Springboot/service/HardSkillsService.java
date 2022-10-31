package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.HardSkills;
import com.miPortfolioWeb.Springboot.repository.IHardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HardSkillsService implements IHardSkillsService {
    
    @Autowired
    public IHardSkillsRepository hardRepo;

    @Override
    public List<HardSkills> verHardSkills() {
        return hardRepo.findAll();
    }

    @Override
    public void agregarHardSkill(HardSkills hardSkill) {
        hardRepo.save(hardSkill);
    }

    @Override
    public void borrarHardSkill(Long id) {
        hardRepo.deleteById(id);
    }

    @Override
    public HardSkills encontrarHardSkill(Long id) {
        return hardRepo.findById(id).orElse(null);
    }
    
}
