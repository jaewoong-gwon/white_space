package com.white_space.cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OnCreateCafeDto {
    private Integer cafeId;
    private String cafeName;
    private byte[] cafeImage;
}
