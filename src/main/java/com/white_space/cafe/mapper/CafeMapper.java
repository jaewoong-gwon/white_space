package com.white_space.cafe.mapper;

import com.white_space.cafe.dto.Cafe;
import com.white_space.cafe.dto.OnCreateCafeDto;
import com.white_space.cafe.dto.OnUpdateRemainSeatDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CafeMapper {
    Integer saveCafe(OnCreateCafeDto createCafeDto);
    List<Cafe> findAllCafe();
    Optional<Cafe> findCafe(int cafeId);
    Integer updateData(OnUpdateRemainSeatDto onUpdateRemainSeatDto);
}
