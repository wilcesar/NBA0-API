package br.com.nbarestapi.controller;

import br.com.nbarestapi.model.ConferenciaModel;
import br.com.nbarestapi.repository.ConferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConferenciaController {

    @Autowired
    private ConferenciaRepository repository;

    @GetMapping(path = "/api/conferencia/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/conferencia/salvar")
    public ConferenciaModel salvar(@RequestBody ConferenciaModel id){
        return repository.save(id);
    }
}
