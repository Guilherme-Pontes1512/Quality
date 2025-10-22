package com.quality.funcao.dto.output;

import lombok.*;

@Getter
@Builder
public class FuncaoOutput {

    private String funcao;

    private String departamento;

    private String processo;

    private String gestor;
}
