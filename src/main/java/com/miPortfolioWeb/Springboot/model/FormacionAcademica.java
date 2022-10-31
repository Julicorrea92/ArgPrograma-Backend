package com.miPortfolioWeb.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class FormacionAcademica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    //@NotNull
    @Size(min = 1, max = 1000, message = "Por favor no deje los campos sin completar")
    private String cursos;

    //@NotNull
    @Size(min = 1, max = 1000, message = "Por favor no deje los campos sin completar")
    private String carreraDeGrado;

    //@NotNull
    @Size(min = 1, max = 1000, message = "Por favor no deje los campos sin completar")
    private String educacionSecundaria;

    public FormacionAcademica() {
    }

    public FormacionAcademica(Long id, String cursos, String carreraDeGrado, String educacionSecundaria) {
        this.id = id;
        this.cursos = cursos;
        this.carreraDeGrado = carreraDeGrado;
        this.educacionSecundaria = educacionSecundaria;
    }

      

}

    

