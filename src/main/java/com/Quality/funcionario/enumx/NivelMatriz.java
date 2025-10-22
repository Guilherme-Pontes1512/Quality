package com.quality.funcionario.enumx;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NivelMatriz {

    A("A"),

    B("B"),

    C("C");

    private final String description;
}
