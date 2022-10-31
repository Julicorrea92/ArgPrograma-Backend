package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.Experiencia;
import com.miPortfolioWeb.Springboot.service.IExperienciaService;
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
@RequestMapping("/explab")

public class ExperienciaController {

    @Autowired
    IExperienciaService expService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarExperiencia(@RequestBody Experiencia expe) {
        expService.agregarExperiencia(expe);
    }        
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expService.verExperiencia();
    }
    
    @GetMapping("/detalle/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){        
        return expService.encontrarExperiencia(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id,
            @RequestParam("puesto") String nuevoPuesto,
            @RequestParam("empresa") String nuevoEmpresa,
            @RequestParam("periodo") String nuevoPeriodo,
            @RequestParam("lugar") String nuevolugar,
            @RequestParam("tareas") String nuevoTareas,
            @RequestParam("imgDes") String nuevaImgDes) {

        Experiencia experiencia = expService.encontrarExperiencia(id);

        experiencia.setPuesto(nuevoPuesto);
        experiencia.setEmpresa(nuevoEmpresa);
        experiencia.setPeriodo(nuevoPeriodo);
        experiencia.setLugar(nuevolugar);
        experiencia.setTareas(nuevoTareas);
        experiencia.setImgDes(nuevaImgDes);

        expService.agregarExperiencia(experiencia);
        return experiencia;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expService.borrarExperiencia(id);
    }
}
