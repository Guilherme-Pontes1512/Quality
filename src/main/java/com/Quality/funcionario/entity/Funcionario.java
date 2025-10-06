package com.quality.funcionario.entity;


import com.quality.funcionario.enumx.NivelMatriz;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "funcionario")
@SequenceGenerator(name = "FUNCIONARIO_SEQ", sequenceName = "FUNCIONARIO_SEQ")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FUNCIONARIO_SEQ")
    @Column(name = "id")
    private Long id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "nome")
    @NotNull(message = "O campo \"Nome\" é obrigatório.")
    private String nome;

    @Column(name = "data_admissao")
    @NotNull(message = "O campo \"Data de admissão\" é obrigatório.")
    private LocalDate dataAdmissao;

    @Column(name = "data_saida")
    private LocalDate dataSaida;

    @Column(name = "pc_quality_user")
    private boolean pcQualityUser = true;

    @Column(name = "matriz_competencia")
    private boolean matrizCompetencia = true;

    @Column(name = "nivel_matriz")
    @NotNull(message = "O campo \"Nível matriz\" é obrigatório.")
    private NivelMatriz nivelMatriz;

    @Column(name = "nivel_atividade")
    @NotNull(message = "O campo \"Nível atividade\" é obrigatório.")
    private int nivelAtividade;

    @Column(name = "ativo")
    private boolean ativo = true;
}
