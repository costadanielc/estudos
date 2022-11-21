package br.atosdaniel.petshop.repository;

import br.atosdaniel.petshop.model.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    List<Cliente> findClienteByCpf(Cliente cliente);
}
