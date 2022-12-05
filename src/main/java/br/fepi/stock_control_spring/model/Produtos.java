package br.fepi.stock_control_spring.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fabricacao;
    private Date validade;
    private String descricao;
    
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private boolean isPerecivel;

    @Column(nullable = false)
    private boolean isTangivel;

    @Column(nullable = false)
    private int quantidade;


    public Produtos(Long id, Date fabricacao, Date validade, String descricao, String nome, boolean isPerecivel, boolean isTangivel, int quantidade) {
        this.id = id;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.descricao = descricao;
        this.nome = nome;
        this.isPerecivel = isPerecivel;
        this.isTangivel = isTangivel;
        this.quantidade = quantidade;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFabricacao() {
        return this.fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return this.validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsPerecivel() {
        return this.isPerecivel;
    }

    public boolean getIsPerecivel() {
        return this.isPerecivel;
    }

    public void setIsPerecivel(boolean isPerecivel) {
        this.isPerecivel = isPerecivel;
    }

    public boolean isIsTangivel() {
        return this.isTangivel;
    }

    public boolean getIsTangivel() {
        return this.isTangivel;
    }

    public void setIsTangivel(boolean isTangivel) {
        this.isTangivel = isTangivel;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
