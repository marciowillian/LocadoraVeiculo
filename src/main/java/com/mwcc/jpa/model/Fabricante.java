package com.mwcc.jpa.model;


import javax.persistence.*;

@Entity
@Table(name = "fabricante")
public class Fabricante {

    private Long codigo;
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
