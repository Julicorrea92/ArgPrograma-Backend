
package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.HardSkills;
import java.util.List;


public interface IHardSkillsService {
    
    //Ver una lista de HardSkills
    public List <HardSkills> verHardSkills();
    
    //Crear una HardSkill nueva    
    public void agregarHardSkill(HardSkills hardSkill);
    
    //Borrar HardSkill de la base de datos
    public void borrarHardSkill(Long id);
    
    //Encontrar HardSkill por ID
    public HardSkills encontrarHardSkill(Long id);
    
    
}
