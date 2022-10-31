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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "Por favor no deje los campos sin completar")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "Por favor no deje los campos sin completar")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = "Por favor no deje los campos sin completar")
    private String rol;

    @NotNull
    @Size(min = 1, max = 300, message = "Por favor no deje los campos sin completar")
    private String sobreMi;

    @NotNull
    @Size (min = 1, max = 300, message ="Por favor no deje los campos sin completar")
    private String imgPerfil;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String rol, String sobreMi, String imgPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.sobreMi = sobreMi;
        this.imgPerfil = imgPerfil;
    }

}
