package com.quality.funcao.repository;

import com.quality.funcao.entity.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncaoRepository extends JpaRepository<Funcao, Long> {

    Funcao findByFuncao(String funcao);
}
