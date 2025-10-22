package com.quality.funcao.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncaoInput {

    private String funcao;

    private String departamento;

    private String processo;

    private String gestor;
}
