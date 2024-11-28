package com.equipe1.rafaelcampos.sistema_escolar.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_sala")
    private Long id;

    @Column(name = "nome_sala")
    private String sala;

    @Column(name = "capacidade")
    private String capacidade;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
}
