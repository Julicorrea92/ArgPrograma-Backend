package com.miPortfolioWeb.Springboot.security.service;

import com.miPortfolioWeb.Springboot.security.model.Usuario;
import com.miPortfolioWeb.Springboot.security.model.UsuarioPpal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired 
    UsuarioService usuarioSer;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioSer.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPpal.build(usuario);
    }



}
