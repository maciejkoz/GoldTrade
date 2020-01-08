package com.example.goldTradeDemo.controller;

import com.example.goldTradeDemo.api.response.BasicResponse;
import com.example.goldTradeDemo.exception.CommonBadRequestException;
import com.example.goldTradeDemo.exception.CommonConflictException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    BasicResponse handleBadRequestException(CommonBadRequestException exception) {
        return BasicResponse.ofError(
                exception.getConstErrorMsg().getErrorCode(),
                exception.getConstErrorMsg().getErrorMsg()
        );
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    BasicResponse handleBadRequestException(CommonConflictException exception) {
        return BasicResponse.ofError(
                exception.getConstErrorMsg().getErrorCode(),
                exception.getConstErrorMsg().getErrorMsg()
        );
    }
}
