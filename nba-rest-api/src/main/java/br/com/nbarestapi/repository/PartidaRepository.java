package br.com.nbarestapi.repository;

import br.com.nbarestapi.model.PartidaModel;
import org.springframework.data.repository.CrudRepository;

public interface PartidaRepository extends CrudRepository<PartidaModel,Integer> {
}
