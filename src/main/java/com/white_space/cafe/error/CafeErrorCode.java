package com.white_space.cafe.error;

import com.white_space.common.error.CommonErrorCode;
import org.springframework.http.HttpStatus;

public enum CafeErrorCode implements CommonErrorCode {
    NOT_FOUND_CAFE(HttpStatus.BAD_REQUEST,"해당 조건으로 검색된 카페가 없습니다!");

    private final HttpStatus httpStatus;
    private final String message;
    CafeErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    @Override
    public HttpStatus getStatus() {
        return this.httpStatus;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
