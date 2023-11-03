package com.white_space.cafe.controller;

import com.white_space.common.dto.CommonResponse;
import com.white_space.common.error.CommonErrorCode;
import com.white_space.common.error.CommonException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CafeExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<CommonResponse<Object>> cafeNotFound(CommonException commonException){
        CommonErrorCode errorCode = commonException.getCommonErrorCode();
        CommonResponse<Object> response = CommonResponse.builder()
                .code(errorCode.getStatus().value())
                .message(errorCode.getMessage())
                .build();
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
