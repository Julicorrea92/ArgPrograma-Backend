
package com.miPortfolioWeb.Springboot.security.repository;

import com.miPortfolioWeb.Springboot.security.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Integer> {
    
    Optional <Usuario> findByNombreUsuario (String nombreUsuario);
    
    boolean existsByNombreUsuario (String nombreUsuario);
    boolean existsByEmail (String email);

    
}
