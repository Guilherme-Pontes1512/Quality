package com.Quality.funcionario.mapper;

import com.Quality.funcionario.dto.input.FuncionarioInput;
import com.Quality.funcionario.dto.output.FuncionarioOutput;
import com.Quality.funcionario.entity.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface FuncionarioMapper {

    Funcionario toEntity(FuncionarioInput input);

    @Mapping(target = "usuario", ignore = true)
    FuncionarioOutput toOutput(Funcionario entity);

    Funcionario updateEntity(@MappingTarget Funcionario entity, FuncionarioInput input);
}
