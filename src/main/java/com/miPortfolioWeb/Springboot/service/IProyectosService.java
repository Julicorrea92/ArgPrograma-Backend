/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
       //Ver una lista de personas
    public List<Proyectos> verProyectos();

    //Crear nueva persona
    public void agregarProyecto(Proyectos proyectos);

    //Borrar persona de la bdd
    public void borrarProyecto(Long id);

    //Encontrar una persona por id
    public Proyectos encontrarProyecto(Long id);

}
    

