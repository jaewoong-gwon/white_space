package com.white_space.cafe.service;

import com.white_space.cafe.dto.Cafe;
import com.white_space.cafe.error.CafeErrorCode;
import com.white_space.cafe.mapper.CafeMapper;
import com.white_space.common.error.CommonException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CafeService {
    private final CafeMapper cafeMapper;

    public List<Cafe> findAllCafe() {
        return cafeMapper.findAllCafe();
    }

    @Transactional
    public boolean saveCafe(Cafe cafe){
        return cafeMapper.saveCafe(cafe) > 0;
    }
    public Cafe findCafe(int cafeId) {
        return cafeMapper.findCafe(cafeId)
                .orElseThrow(()-> new CommonException(CafeErrorCode.NOT_FOUND_CAFE));
    }

    @Transactional
    public boolean saveData(Cafe cafe) {
        return cafeMapper.updateData(cafe) > 0;
    }
}
