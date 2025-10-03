package com.Quality.funcionario.service;

import com.Quality.funcionario.dto.input.FuncionarioInput;
import com.Quality.funcionario.dto.output.FuncionarioOutput;
import com.Quality.funcionario.entity.Funcionario;
import com.Quality.funcionario.mapper.FuncionarioMapper;
import com.Quality.funcionario.repository.FuncionarioRepository;
import com.Quality.funcionario.validator.validator.FuncionarioValidator;
import com.Quality.utils.exceptions.BusinessException;
import com.Quality.utils.messages.FuncionarioMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    public final FuncionarioValidator validator;

    public final FuncionarioMapper mapper;

    public final FuncionarioRepository repository;

    @Transactional
    public void inserir(FuncionarioInput input) {
        validator.validar(input);
        Funcionario entity = mapper.toEntity(input);
        repository.save(entity);
    }

    @Transactional
    public void atualizar(Long id, FuncionarioInput input) {
        Funcionario entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format(FuncionarioMessages.FUNCIONARIO_NAO_ENCONTRADO_COM_ID.getDescription(), id)
                ));

        validator.validar(input);
        mapper.updateEntity(entity, input);
        repository.save(entity);
    }

    @Transactional(readOnly = true)
    public FuncionarioOutput find(String nome) {
        Funcionario entity = repository.findByNome(nome);
        return mapper.toOutput(entity);
    }

    @Transactional
    public void remover(String nome) {
        Funcionario entity = repository.findByNome(nome);
        repository.delete(entity);
    }
}
