package com.Quality.utils.messages;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FuncionarioMessages {

    DATA_ADMISSAO_MENOR_IGUAL_DATA_SAIDA("A data de admissão não pode ser maior que a data de saída."),

    FUNCIONARIO_NAO_ENCONTRADO_COM_ID("Funcionario não encontrado com ID \"%s\".");

    public final String description;
}
