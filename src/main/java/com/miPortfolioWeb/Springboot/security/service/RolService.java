package com.miPortfolioWeb.Springboot.security.service;

import com.miPortfolioWeb.Springboot.security.enums.RolNombre;
import com.miPortfolioWeb.Springboot.security.model.Rol;
import com.miPortfolioWeb.Springboot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository rolRepo;
    
    public Optional <Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void agregarRol(Rol rol){
        rolRepo.save(rol);
    }
    
    
    
    
    
    
}
