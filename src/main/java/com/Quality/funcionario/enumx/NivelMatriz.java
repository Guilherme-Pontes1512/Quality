package com.quality.funcionario.enumx;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NivelMatriz {

    A("A"),

    B("B"),

    C("C");

    private final String description;
}
