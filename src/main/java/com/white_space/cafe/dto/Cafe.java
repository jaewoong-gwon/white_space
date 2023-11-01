package com.white_space.cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cafe {
    private int cafeId;
    private String cafeName;
    private byte[] cafeImage;
    private int remainSeat;
    private double percent;
}
