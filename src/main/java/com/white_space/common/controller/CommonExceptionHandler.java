package com.white_space.common.controller;

import com.white_space.common.dto.CommonResponse;
import com.white_space.common.error.CommonErrorCode;
import com.white_space.common.error.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<CommonResponse<Object>> commonException(CommonException commonException){
        CommonErrorCode errorCode = commonException.getCommonErrorCode();
        CommonResponse<Object> response = CommonResponse.builder()
                .code(errorCode.getStatus().value())
                .message(errorCode.getMessage())
                .build();
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<CommonResponse<Object>> validationFail(MethodArgumentNotValidException exception){
        CommonResponse<Object> response = CommonResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message(exception.getMessage())
                .build();
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
