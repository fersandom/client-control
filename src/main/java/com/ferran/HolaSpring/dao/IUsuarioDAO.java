package com.ferran.HolaSpring.dao;

import com.ferran.HolaSpring.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO  extends JpaRepository<Usuario, Long>{
    
    Usuario findByUsername(String username);
    
}
