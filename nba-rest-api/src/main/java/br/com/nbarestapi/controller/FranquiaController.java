package br.com.nbarestapi.controller;

import br.com.nbarestapi.model.FranquiaModel;
import br.com.nbarestapi.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FranquiaController {

    @Autowired
    private FranquiaRepository repository;

    @GetMapping(path = "/api/franquia/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/franquia/salvar")
    public FranquiaModel salvar(@RequestBody FranquiaModel franquia){
        return repository.save(franquia);
    }
}
