package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Persona;
import java.util.List;

public interface IPersonaService {

    //Ver una lista de personas
    public List<Persona> verPersonas();

    //Crear nueva persona
    public void agregarPersona(Persona persona);

    //Borrar persona de la bdd
    public void borrarPersona(Long id);

    //Encontrar una persona por id
    public Persona encontrarPersona(Long id);

}
