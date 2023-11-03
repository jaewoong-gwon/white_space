package com.white_space.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.white_space.common.dto.CommonResponse;
import com.white_space.common.error.CommonErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
@Component
public class ErrorResponseCreateUtil {
    private final ObjectMapper objectMapper;

    public void setResponse(HttpServletResponse httpServletResponse, CommonErrorCode errorCode) throws IOException {
        CommonResponse<?> errorResponse = CommonResponse.builder()
                .code(errorCode.getStatus().value())
                .message(errorCode.getMessage())
                .build();
        httpServletResponse.setStatus(errorResponse.getCode());
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.getWriter()
                .write(objectMapper.writeValueAsString(errorResponse));
    }
}
