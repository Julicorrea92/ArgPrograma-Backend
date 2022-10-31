package com.miPortfolioWeb.Springboot.security.repository;

import com.miPortfolioWeb.Springboot.security.enums.RolNombre;
import com.miPortfolioWeb.Springboot.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository <Rol, Integer>{
    
    Optional <Rol> findByRolNombre (RolNombre rolNombre);
    
    
}
