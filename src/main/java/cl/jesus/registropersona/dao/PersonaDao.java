package cl.jesus.registropersona.dao;

import cl.jesus.registropersona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {
}
