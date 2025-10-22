package com.quality.funcionario.mapper;

import com.quality.funcionario.dto.input.FuncionarioInput;
import com.quality.funcionario.dto.output.FuncionarioOutput;
import com.quality.funcionario.entity.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface FuncionarioMapper {

    Funcionario toEntity(FuncionarioInput input);

    FuncionarioOutput toOutput(Funcionario entity);

    void updateEntity(@MappingTarget Funcionario entity, FuncionarioInput input);
}
