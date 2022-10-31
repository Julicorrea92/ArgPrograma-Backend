
package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
    
}
