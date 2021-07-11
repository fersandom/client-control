package com.ferran.HolaSpring.servicio;

import com.ferran.HolaSpring.dao.IPersonaDao;
import com.ferran.HolaSpring.dominio.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService {
    
    @Autowired
    private IPersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersonas() {
        return (List<Persona>) personaDao.findAll();
    }
    
    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }
    
    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
