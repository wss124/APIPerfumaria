package com.perfumaria.APIPerfumaria.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Perfume {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column
    private long Id;
     
    
    @Column
    private String nome;
    
    
    @Column
    private Double preco;

    @ManyToOne
    @JoinColumn(name= "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    
}
