package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.FormacionAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormacionRepository extends JpaRepository <FormacionAcademica, Long>{
    
    
}

