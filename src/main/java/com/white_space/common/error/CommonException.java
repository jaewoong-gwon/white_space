package com.white_space.common.error;

import lombok.Getter;

@Getter
public class CommonException extends RuntimeException{
    private final CommonErrorCode commonErrorCode;

    public CommonException(CommonErrorCode commonErrorCode){
        this.commonErrorCode = commonErrorCode;
    }
}
