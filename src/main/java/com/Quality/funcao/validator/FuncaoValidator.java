package com.quality.funcao.validator;

import com.quality.funcao.dto.input.FuncaoInput;
import com.quality.funcao.entity.Funcao;
import com.quality.funcao.validator.validations.FuncaoValidations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FuncaoValidator {

    private final FuncaoValidations validations;

    public void validarInserir(FuncaoInput input) {
        validations.validaFuncaoJaExistente(input.getFuncao());
    }

    public void validarAtualizar(FuncaoInput input, Funcao entity) {
    }
}
