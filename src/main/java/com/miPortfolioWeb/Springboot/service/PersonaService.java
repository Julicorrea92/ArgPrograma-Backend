package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Persona;
import com.miPortfolioWeb.Springboot.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;//chequear que funcione, sino borrar

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public IPersonaRepository perRepo;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> persona = perRepo.findAll();
        return persona;//Funcion LARGA
        //return perRepo.findAll(); funcion Profe Luisina
    }

    @Override
    public void agregarPersona(Persona persona) {
        perRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        perRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Long id) {
        Persona persona = perRepo.findById(id).orElse(null);
        return persona;
        //return perRepo.findById(id).orElse(null); funcion Profe Luisina
    }

}
