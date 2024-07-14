package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class UserException extends RuntimeException{

    private HttpStatus errorCode;
    private String errorMessage;

    public UserException(HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public UserException() {
    }

}
