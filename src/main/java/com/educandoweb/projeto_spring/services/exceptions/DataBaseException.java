package com.educandoweb.projeto_spring.services.exceptions;

import java.io.Serial;

public class DataBaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DataBaseException (String msg){
        super(msg);
    }
}
