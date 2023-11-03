package com.white_space.common.error;

import org.springframework.http.HttpStatus;

public interface CommonErrorCode {
    HttpStatus getStatus();
    String getMessage();

}
