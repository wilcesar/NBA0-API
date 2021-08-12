package br.com.nbarestapi.repository;

import br.com.nbarestapi.model.ConferenciaModel;
import org.springframework.data.repository.CrudRepository;

public interface ConferenciaRepository extends CrudRepository<ConferenciaModel, Integer> {
}
