package com.perfumaria.APIPerfumaria.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Perfume {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY )
     private long Id;

    private String nome;
    private String marca;
    private Double preco;

    @ManyToOne
    @JoinColumn(name= "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;


    
}
