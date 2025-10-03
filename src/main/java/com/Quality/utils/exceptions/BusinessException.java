package com.Quality.utils.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Exception e) {
        super(mensagem, e);
    }
}
