package com.Quality.funcionario.dto.input;

import com.Quality.funcionario.enumx.NivelMatriz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionarioInput {

    private String usuario;

    private String nome;

    private LocalDate dataAdmissao;

    private LocalDate dataSaida;

    private boolean pcQualityUser;

    private boolean matrizCompetencia;

    private NivelMatriz nivelMatriz;

    private boolean ativo;

    private int nivelAtividade;
}
