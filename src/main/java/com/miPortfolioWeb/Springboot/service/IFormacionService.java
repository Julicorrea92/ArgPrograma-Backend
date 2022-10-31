package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.FormacionAcademica;
import java.util.List;


public interface IFormacionService {
    
        //Ver una lista de Formaciones
    public List<FormacionAcademica> verFormacion();

    //Crear una nueva Formacion
    public void agregarFormacion(FormacionAcademica experiencia);

    //Borrar una formacion de la bdd
    public void borrarFormacion(Long id);

    //Encontrar una formacion por ID
    public FormacionAcademica encontrarFormacion(Long id);
    
}
