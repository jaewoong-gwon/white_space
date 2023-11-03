package com.white_space.cafe.service;

import com.white_space.cafe.dto.Cafe;
import com.white_space.cafe.dto.OnCreateCafeDto;
import com.white_space.cafe.dto.OnUpdateRemainSeatDto;
import com.white_space.cafe.error.CafeErrorCode;
import com.white_space.cafe.mapper.CafeMapper;
import com.white_space.common.error.CommonException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CafeService {
    private final CafeMapper cafeMapper;

    public List<Cafe> findAllCafe() {
        return cafeMapper.findAllCafe();
    }

    @Transactional
    public boolean saveCafe(OnCreateCafeDto createCafeDto){
        return cafeMapper.saveCafe(createCafeDto) > 0;
    }
    public Cafe findCafe(int cafeId) {
        return cafeMapper.findCafe(cafeId)
                .orElseThrow(()-> new CommonException(CafeErrorCode.NOT_FOUND_CAFE));
    }

    @Transactional
    public boolean updateData(OnUpdateRemainSeatDto onUpdateRemainSeatDto) {
        return cafeMapper.updateData(onUpdateRemainSeatDto) > 0;
    }
}
