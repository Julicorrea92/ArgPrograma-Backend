package com.miPortfolioWeb.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String puesto;

    private String empresa;

    private String periodo;

    private String lugar;

    private String tareas;

    private String imgDes;

    public Experiencia() {
    }

    public Experiencia(Long id, String puesto, String empresa, String periodo, String lugar, String tareas, String imgDes) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.periodo = periodo;
        this.lugar = lugar;
        this.tareas = tareas;
        this.imgDes = imgDes;
    }

}
