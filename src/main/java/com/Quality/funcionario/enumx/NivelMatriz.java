package com.quality.funcionario.enumx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum NivelMatriz {

    A("A"),

    B("B"),

    C("C");

    private final String description;
}
