package br.com.nbarestapi.model;

import javax.persistence.*;

@Entity(name = "partidas")
public class PartidaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @OneToOne
    @JoinColumn(name = "mandante_id",referencedColumnName = "id")
    public FranquiaModel mandante;

    @Column(name = "mandante_placar")
    public Integer mandantePlacar;

    @OneToOne
    @JoinColumn(name = "visitante_id",referencedColumnName = "id")
    public FranquiaModel visitante;

    @Column(name = "visitante_placar")
    public Integer visitantePlacar;

    @OneToOne
    @JoinColumn(name = "ganhador_id",referencedColumnName = "id")
    public FranquiaModel ganhador;

    public FranquiaModel getGanhador() {
        return ganhador;
    }

    public void setGanhador(FranquiaModel ganhador) {
        this.ganhador = ganhador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMandantePlacar() {
        return mandantePlacar;
    }

    public void setMandantePlacar(Integer mandantePlacar) {
        this.mandantePlacar = mandantePlacar;
    }

    public FranquiaModel getMandante() {
        return mandante;
    }

    public void setMandante(FranquiaModel mandante) {
        this.mandante = mandante;
    }

    public FranquiaModel getVisitante() {
        return visitante;
    }

    public void setVisitante(FranquiaModel visitante) {
        this.visitante = visitante;
    }

    public Integer getVisitantePlacar() {
        return visitantePlacar;
    }

    public void setVisitantePlacar(Integer visitantePlacar) {
        this.visitantePlacar = visitantePlacar;
    }

}
