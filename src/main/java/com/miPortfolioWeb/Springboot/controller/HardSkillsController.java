package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.HardSkills;
import com.miPortfolioWeb.Springboot.service.IHardSkillsService;
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
@RequestMapping("/skills")
public class HardSkillsController {
    
    @Autowired
    private IHardSkillsService hardService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarHardSkill(@RequestBody HardSkills hardSkill) {
        hardService.agregarHardSkill(hardSkill);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<HardSkills> verHardSkills() {
        return hardService.verHardSkills();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarHardSkill(@PathVariable Long id) {
        hardService.borrarHardSkill(id);
    }
    
    @GetMapping("/detalle/{id}")
    public HardSkills findSkill(@PathVariable Long id){        
        return hardService.encontrarHardSkill(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public HardSkills editarHardSkill(@PathVariable Long id,
                         @RequestParam("nombreHard") String nuevoNombre,
                         @RequestParam("porcentajeHard") Number nuevoPorcentaje){
        
        HardSkills hardSkill = hardService.encontrarHardSkill(id);
        
        hardSkill.setNombreHard(nuevoNombre);
        hardSkill.setPorcentajeHard(nuevoPorcentaje);
        
        hardService.agregarHardSkill(hardSkill);
        return hardSkill;
    }
            
}
