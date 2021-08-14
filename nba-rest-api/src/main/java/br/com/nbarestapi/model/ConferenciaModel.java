package br.com.nbarestapi.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "conferencias")
public class ConferenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @Column(name = "nome", nullable = false, length = 20)
    public String nome;

    @OneToMany
    @JoinColumn(name = "conferencia_id")
    private List<FranquiaModel> franquias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<FranquiaModel> getFranquias() {
        return franquias;
    }

    public void setFranquias(List<FranquiaModel> franquias) {
        this.franquias = franquias;
    }

}
