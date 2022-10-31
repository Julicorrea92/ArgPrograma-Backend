package com.miPortfolioWeb.Springboot.repository;

import com.miPortfolioWeb.Springboot.model.Experiencia;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {

    //public Optional<Experiencia> existsById(String puesto);

    //public boolean existsById(Long id);
}
