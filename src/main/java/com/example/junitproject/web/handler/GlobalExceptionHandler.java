package com.example.junitproject.web.handler;

import com.example.junitproject.web.dto.response.CMResDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> apiException(RuntimeException e) {
        return new ResponseEntity<>(CMResDto.builder()
            .code(-1)
            .msg(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
