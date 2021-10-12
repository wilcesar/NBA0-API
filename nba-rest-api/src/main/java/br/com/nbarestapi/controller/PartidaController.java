package br.com.nbarestapi.controller;

import br.com.nbarestapi.model.PartidaModel;
import br.com.nbarestapi.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PartidaController {
    @Autowired
    private PartidaRepository repository;

    @GetMapping(path = "/api/partida/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/partida/salvar")
    public PartidaModel salvar(@RequestBody PartidaModel partida){
        return repository.save(partida);
    }
}
