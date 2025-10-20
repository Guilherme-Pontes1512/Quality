package com.quality.funcionario.dto.input;

import com.quality.funcionario.enumx.NivelMatriz;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
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
