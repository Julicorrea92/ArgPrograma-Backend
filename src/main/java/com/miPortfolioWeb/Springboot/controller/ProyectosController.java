package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.Proyectos;
import com.miPortfolioWeb.Springboot.service.IProyectosService;
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
@RequestMapping("/proyectos")
public class ProyectosController {

    @Autowired
    public IProyectosService proyService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarProyecto(@RequestBody Proyectos proy) {
        proyService.agregarProyecto(proy);

    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyService.verProyectos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id) {
        proyService.borrarProyecto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Proyectos editarPersona(@PathVariable Long id,
            @RequestParam("descripcion") String nuevoProyecto,
            @RequestParam("imgPerfil") String nuevoImgPerfil) {

        Proyectos proyecto = proyService.encontrarProyecto(id);

        proyecto.setDescripcion(nuevoProyecto);
        proyecto.setImgPerfil(nuevoImgPerfil);

        proyService.agregarProyecto(proyecto);
        return proyecto;

    }
}
