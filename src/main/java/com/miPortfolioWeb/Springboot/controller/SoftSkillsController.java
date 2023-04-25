
package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.SoftSkills;
import com.miPortfolioWeb.Springboot.service.ISoftSkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/softskill")
public class SoftSkillsController {
    
    @Autowired
    private ISoftSkillsService softService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarSoftSkill(@RequestBody SoftSkills softSkill) {
        softService.agregarSoftSkill(softSkill);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<SoftSkills> verHardSkills() {
        return softService.verSoftSkills();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarSoftSkill(@PathVariable Long id) {
        softService.borrarSoftSkill(id);
    }
    
    @GetMapping("/detalle/{id}")
    public SoftSkills findSkill(@PathVariable Long id){        
        return softService.encontrarSoftSkill(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public SoftSkills editarHardSkill(@PathVariable Long id,
                         @RequestParam("nombreSoft") String nuevoNombre,
                         @RequestParam("porcentajeSoft") Number nuevoPorcentaje){
        
        SoftSkills softSkill = softService.encontrarSoftSkill(id);
        
        softSkill.setNombreSoft(nuevoNombre);
        softSkill.setPorcentajeSoft(nuevoPorcentaje);
        
        softService.agregarSoftSkill(softSkill);
        return softSkill;
    }
    
}
