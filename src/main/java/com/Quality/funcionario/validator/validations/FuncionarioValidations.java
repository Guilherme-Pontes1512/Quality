package com.Quality.funcionario.validator.validations;

import com.Quality.utils.exceptions.BusinessException;
import com.Quality.utils.messages.FuncionarioMessages;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class FuncionarioValidations {

    public void validaDataAdmissaoMenorIgualDataSaida(LocalDate dataAdmissao, LocalDate dataSaida) {
        if (dataSaida.isBefore(dataAdmissao)) {
            throw new BusinessException(FuncionarioMessages.DATA_ADMISSAO_MENOR_IGUAL_DATA_SAIDA.getDescription());
        }
    }
}
