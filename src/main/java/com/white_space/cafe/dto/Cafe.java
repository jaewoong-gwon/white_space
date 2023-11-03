package com.white_space.cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cafe {
    private Integer cafeId;
    @NotNull(message = "카페 이름은 필수 입니다!")
    private String cafeName;
    private byte[] cafeImage;
    @NotNull(message = "갱신 요청시, 해당 필드는 null 일 수 없습니다!")
    private Integer remainSeat;
    @NotNull(message = "갱신 요청시, 해당 필드는 null 일 수 없습니다!")
    private Double percent;

    public OnUpdateRemainSeatDto onUpdateRemainSeatDto(){
        return OnUpdateRemainSeatDto.builder()
                .remainSeat(remainSeat)
                .percent(percent)
                .build();
    }

    public OnCreateCateDto onCreateCateDto(){
        return OnCreateCateDto.builder()
                .cafeName(cafeName)
                .cafeImage(cafeImage)
                .build();
    }
}
