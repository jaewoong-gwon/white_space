package com.white_space.cafe.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Cafe {
    private Integer cafeId;
    @NotNull(message = "카페 이름은 필수 입니다!")
    private String cafeName;
    private byte[] cafeImage;
    @NotNull(message = "갱신 요청시, 해당 필드는 null 일 수 없습니다!")
    private Integer remainSeat;
    @NotNull(message = "갱신 요청시, 해당 필드는 null 일 수 없습니다!")
    private Integer percent;

    public OnUpdateRemainSeatDto onUpdateRemainSeatDto(){
        return OnUpdateRemainSeatDto.builder()
                .cafeId(cafeId)
                .remainSeat(remainSeat)
                .percent(percent)
                .build();
    }

    public OnCreateCafeDto onCreateCateDto(){
        return OnCreateCafeDto.builder()
                .cafeName(cafeName)
                .cafeImage(cafeImage)
                .build();
    }
}
