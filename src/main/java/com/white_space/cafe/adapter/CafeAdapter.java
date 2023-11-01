package com.white_space.cafe.adapter;

import com.white_space.cafe.application.port.CafePort;
import com.white_space.cafe.dto.Cafe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CafeAdapter implements CafePort {
    private final CafeMapper cafeMapper;
    @Override
    public boolean saveCafe(Cafe cafe) {
        return cafeMapper.saveCafe(cafe) > 0;
    }

    @Override
    public List<Cafe> findAllCafe() {
        return cafeMapper.findAllCafe();
    }

    @Override
    public Cafe findCafe(int cafeId) {
        return cafeMapper.findCafe(cafeId);
    }
    @Override
    public boolean saveData(Cafe cafe) {
        return cafeMapper.saveData(cafe) > 0;
    }

}
