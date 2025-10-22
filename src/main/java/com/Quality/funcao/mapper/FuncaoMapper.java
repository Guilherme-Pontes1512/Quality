package com.quality.funcao.mapper;

import com.quality.funcao.dto.input.FuncaoInput;
import com.quality.funcao.dto.output.FuncaoOutput;
import com.quality.funcao.entity.Funcao;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface FuncaoMapper {

    Funcao toEntity(FuncaoInput input);

    FuncaoOutput toOutput(Funcao entity);

    void updateEntity(@MappingTarget Funcao entity, FuncaoInput input);
}
