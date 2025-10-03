package com.quality.funcionario.validator.validator;

import com.quality.funcionario.dto.input.FuncionarioInput;
import com.quality.funcionario.validator.validations.FuncionarioValidations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FuncionarioValidator {

    public final FuncionarioValidations validations;

    public void validar(FuncionarioInput input) {
        validations.validaDataAdmissaoMenorIgualDataSaida(input.getDataAdmissao(), input.getDataSaida());
    }
}
