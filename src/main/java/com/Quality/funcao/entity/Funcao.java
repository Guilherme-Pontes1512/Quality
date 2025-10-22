package com.quality.funcao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "funcao")
@SequenceGenerator(name = "FUNCAO_SEQ", sequenceName = "FUNCAO_SEQ", allocationSize = 1)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FUNCAO_SEQ")
    @Column(name = "id")
    private Long id;

    @Column(name = "funcao")
    private String funcao;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "processo")
    private String processo;

    @Column(name = "gestor")
    private String gestor;
}
