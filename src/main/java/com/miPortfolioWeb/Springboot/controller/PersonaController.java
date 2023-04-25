package com.miPortfolioWeb.Springboot.controller;

import com.miPortfolioWeb.Springboot.model.Persona;
import com.miPortfolioWeb.Springboot.service.IPersonaService;
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
import org.springframework.web.bind.annotation.ResponseBody;//ver
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    IPersonaService perService;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public String agregarPersona(@RequestBody Persona persona) {
        perService.agregarPersona(persona);
        return "La persona fue creada correctamente";

        //public void agregarPersona(@RequestBody Persona pers) {
        // perService.agregarPersona(pers);Metodo de master class profe Luisina
    }

    @GetMapping("/ver")
    @ResponseBody//ver
    public List<Persona> verPersonas() {
        return perService.verPersonas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")    
    public String borrarPersona(@PathVariable Long id) {
        perService.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    //public void borrarPersona(@PathVariable Long id) {
     //perService.borrarPersona(id); Metodo de master class profe Luisina
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("rol") String nuevoRol,
            @RequestParam("sobreMi") String nuevoSobreMi,
            @RequestParam("imgPerfil") String nuevoImgPerfil) {

        Persona persona = perService.encontrarPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setRol(nuevoRol);
        persona.setSobreMi(nuevoSobreMi);
        persona.setImgPerfil(nuevoImgPerfil);

        perService.agregarPersona(persona);
        return persona;

    }

}
