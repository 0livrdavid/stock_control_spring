package br.fepi.stock_control_spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private Long telefone;


    public Usuarios(Long id, String nome, Long telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

}
