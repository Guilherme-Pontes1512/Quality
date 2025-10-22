package com.quality.funcao.validator.validations;

import com.quality.funcao.entity.Funcao;
import com.quality.funcao.repository.FuncaoRepository;
import com.quality.utils.messages.FuncaoMessages;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FuncaoValidations {

    private final FuncaoRepository repository;

    public void validaFuncaoJaExistente(String funcao) {
        Funcao existente = repository.findByFuncao(funcao);
        if (existente != null) {
            throw new IllegalArgumentException(String.format(FuncaoMessages.FUNCAO_JA_EXISTENTE.getDescription(), funcao));
        }
    }
}
