package br.com.nbarestapi.model;

import javax.persistence.*;

@Entity(name = "franquias")
public class FranquiaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @Column(name = "nome", nullable = false, length = 20)
    public String nome;

    @Column(name = "fundacao", nullable = false)
    public Integer fundacao;

    //@OneToOne(cascade = CascadeType.ALL)
    @ManyToOne
    @JoinColumn(name = "conferencia_id",referencedColumnName = "id")
    public ConferenciaModel conferencia;

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

    public Integer getFundacao() {
        return fundacao;
    }

    public void setFundacao(Integer fundacao) {
        this.fundacao = fundacao;
    }

    public ConferenciaModel getConferencia() {
        return conferencia;
    }

    public void setConferencia(ConferenciaModel conferencia) {
        this.conferencia = conferencia;
    }
}
