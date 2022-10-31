package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    //Crear una nueva experiencia
    public void agregarExperiencia(Experiencia experiencia);

    //Ver una lista de Experiencias
    public List<Experiencia> verExperiencia();

    //Borrar una experiencia de la bdd
    public void borrarExperiencia(Long id);

    //Encontrar una experiencia por ID
    public Experiencia encontrarExperiencia(Long id);
    
    
    
    

}
