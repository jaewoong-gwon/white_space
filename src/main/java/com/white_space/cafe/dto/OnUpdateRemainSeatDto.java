package com.white_space.cafe.dto;

import lombok.*;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OnUpdateRemainSeatDto {
    private Integer cafeId;
    private Integer remainSeat;
    private Integer percent;

}
