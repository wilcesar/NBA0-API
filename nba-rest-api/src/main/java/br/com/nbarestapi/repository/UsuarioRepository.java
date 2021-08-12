package br.com.nbarestapi.repository;

import br.com.nbarestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
}
