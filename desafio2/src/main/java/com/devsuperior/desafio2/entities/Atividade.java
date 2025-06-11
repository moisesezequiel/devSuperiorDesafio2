package com.devsuperior.desafio2.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_atividade" )
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Atividade(Long id, String descricao) {
        this.id = id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Atividade categoria = (Atividade) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
