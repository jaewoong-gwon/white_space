package com.white_space.cafe.adapter;

import com.white_space.cafe.dto.Cafe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    Integer saveCafe(Cafe cafe);
    List<Cafe> findAllCafe();
    Cafe findCafe(int cafeId);
    Integer saveData(Cafe cafe);
}
