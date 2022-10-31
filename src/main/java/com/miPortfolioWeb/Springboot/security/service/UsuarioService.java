package com.miPortfolioWeb.Springboot.security.service;

import com.miPortfolioWeb.Springboot.security.model.Usuario;
import com.miPortfolioWeb.Springboot.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepository usRepo;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usRepo.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario (String nombreUsuario){
        return usRepo.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail (String email){ //cambie Boolean x boolean
        return usRepo.existsByEmail(email);
    }

    public void  agregarUsuario (Usuario usuario){ //cambie nombreUsuario por usuario solo 
        usRepo.save(usuario);
    }
}
        
