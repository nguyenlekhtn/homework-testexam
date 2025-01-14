package com.testexam.demo.question2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ConflictException.class)
    public ErrorMessageDTO handleConflictException(ConflictException exception) {
        return ErrorMessageDTO.builder()
                .code(exception.getReturnCode())
                .description(exception.getReturnDesc())
                .build();
    }
}
