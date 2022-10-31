/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
