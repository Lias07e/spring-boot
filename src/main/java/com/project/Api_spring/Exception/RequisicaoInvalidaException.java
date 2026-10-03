package com.project.Api_spring.Exception;

public class RequisicaoInvalidaException  extends RuntimeException{
    
    public RequisicaoInvalidaException(String mensagem){
        super(mensagem);
    }
}
