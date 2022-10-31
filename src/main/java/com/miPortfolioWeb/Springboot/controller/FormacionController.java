package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.FormacionAcademica;
import com.miPortfolioWeb.Springboot.service.IFormacionService;
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
@CrossOrigin(origins = "https://correajportfolio.web.app")
@RequestMapping("/educacion")
public class FormacionController {

    @Autowired
    private IFormacionService formService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarFormacion(@RequestBody FormacionAcademica form) {
        formService.agregarFormacion(form);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<FormacionAcademica> verFormacion() {
        return formService.verFormacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarFormacion(@PathVariable Long id) {
        formService.borrarFormacion(id);
    }
    
    @GetMapping("/detalle/{id}")
    public FormacionAcademica findFormacion(@PathVariable Long id){        
        return formService.encontrarFormacion(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public FormacionAcademica editarFormacion(@PathVariable Long id,
            @RequestParam("cursos") String nuevoCursos,
            @RequestParam("carreraDeGrado") String nuevoCarreraDeGrado,
            @RequestParam("educacionSecundaria") String nuevoEducacionSecundaria) {

        FormacionAcademica formacion = formService.encontrarFormacion(id);

        formacion.setCursos(nuevoCursos);
        formacion.setCarreraDeGrado(nuevoCarreraDeGrado);
        formacion.setEducacionSecundaria(nuevoEducacionSecundaria);

        formService.agregarFormacion(formacion);
        return formacion;

    }
}
