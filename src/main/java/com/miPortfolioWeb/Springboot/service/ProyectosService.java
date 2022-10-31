package com.miPortfolioWeb.Springboot.service;

import com.miPortfolioWeb.Springboot.model.Proyectos;
import com.miPortfolioWeb.Springboot.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public IProyectosRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyectos proyectos) {
        proyRepo.save(proyectos);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos encontrarProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

}
