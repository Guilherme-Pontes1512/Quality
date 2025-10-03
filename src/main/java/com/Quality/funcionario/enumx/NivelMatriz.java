package com.Quality.funcionario.enumx;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum NivelMatriz {
    A("A"),
    B("B"),
    C("C");

    private final String description;
}

