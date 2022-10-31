
package com.miPortfolioWeb.Springboot.security.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mensaje {
    private String mensaje;    
  

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    //faltaban Getter and setter
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    
}
