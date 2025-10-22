package com.quality.funcionario.dto.output;

import com.quality.funcionario.enumx.NivelMatriz;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Getter
public class FuncionarioOutput {

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
