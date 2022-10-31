
package com.miPortfolioWeb.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "Por favor no deje los campos sin completar")
    private String descripcion;

    /* @NotNull
    @Size (min = 1, max = 50, message ="Por favor no deje los campos sin completar") */
    private String imgPerfil;
    
    
    
    
    
    
}
