
package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.SoftSkills;
import java.util.List;


public interface ISoftSkillsService {

    
    //Ver una lista de SoftSkills
    public List <SoftSkills> verSoftSkills();
    
    //Crear una SoftSkill nueva    
    public void agregarSoftSkill(SoftSkills softSkill);
    
    //Borrar SoftSkill de la base de datos
    public void borrarSoftSkill(Long id);
    
    //Encontrar SoftSkill por ID
    public SoftSkills encontrarSoftSkill(Long id);
    
    
}
    

