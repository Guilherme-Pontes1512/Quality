package com.quality.utils.messages;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FuncaoMessages {

    FUNCAO_JA_EXISTENTE("Função \"%s\" já existente."),

    FUNCAO_NAO_ENCONTRADA_COM_ID("Função não encontrada com ID \"%s\".");

    public final String description;
}
