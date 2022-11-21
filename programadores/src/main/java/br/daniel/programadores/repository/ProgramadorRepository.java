package br.daniel.programadores.repository;

import br.daniel.programadores.model.Programador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgramadorRepository extends JpaRepository<Programador, Long> {

    //Programador findById(Long id);
}
