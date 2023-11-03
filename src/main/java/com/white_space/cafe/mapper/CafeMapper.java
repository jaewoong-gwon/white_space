package com.white_space.cafe.mapper;

import com.white_space.cafe.dto.Cafe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CafeMapper {
    Integer saveCafe(Cafe cafe);
    List<Cafe> findAllCafe();
    Optional<Cafe> findCafe(int cafeId);
    Integer updateData(Cafe cafe);
}
