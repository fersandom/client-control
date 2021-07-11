package com.ferran.HolaSpring.dao;

import com.ferran.HolaSpring.dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
