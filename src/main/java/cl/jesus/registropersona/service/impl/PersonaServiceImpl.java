package cl.jesus.registropersona.service.impl;

import cl.jesus.registropersona.commons.GenericServiceImpl;
import cl.jesus.registropersona.dao.PersonaDao;
import cl.jesus.registropersona.model.Persona;
import cl.jesus.registropersona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDao;
    }

}
