package br.javaAngular.repository;
import br.javaAngular.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Repositorio extends JpaRepository<Cliente, Long> {

}
