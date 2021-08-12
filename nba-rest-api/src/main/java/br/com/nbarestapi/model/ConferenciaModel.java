package br.com.nbarestapi.model;

import javax.persistence.*;

@Entity(name = "conferencias")
public class ConferenciaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, length = 20)
    public String nome;
}
