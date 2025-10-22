package com.quality.funcao.service;

import com.quality.funcao.dto.input.FuncaoInput;
import com.quality.funcao.dto.output.FuncaoOutput;
import com.quality.funcao.entity.Funcao;
import com.quality.funcao.mapper.FuncaoMapper;
import com.quality.funcao.repository.FuncaoRepository;
import com.quality.funcao.validator.FuncaoValidator;
import com.quality.utils.messages.FuncaoMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FuncaoService {

    private final FuncaoValidator validator;

    private final FuncaoMapper mapper;

    private final FuncaoRepository repository;

    @Transactional
    public void inserir(FuncaoInput input) {
        validator.validarInserir(input);
        Funcao entity = mapper.toEntity(input);
        repository.save(entity);
    }

    @Transactional
    public void atualizar(Long id, FuncaoInput input) {
        Funcao entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format(FuncaoMessages.FUNCAO_NAO_ENCONTRADA_COM_ID.getDescription(), id)));
        validator.validarAtualizar(input, entity);
        mapper.updateEntity(entity, input);
        repository.save(entity);
    }

    @Transactional(readOnly = true)
    public FuncaoOutput find(String funcao) {
        Funcao entity = repository.findByFuncao(funcao);
        return mapper.toOutput(entity);
    }

    @Transactional
    public void remover(Long id) {
        Funcao entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format(FuncaoMessages.FUNCAO_NAO_ENCONTRADA_COM_ID.getDescription(), id)));
        repository.delete(entity);
    }

}
