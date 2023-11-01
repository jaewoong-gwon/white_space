package com.white_space.cafe.application.service;

import com.white_space.cafe.application.port.CafePort;
import com.white_space.cafe.dto.Cafe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CafeService {
    private final CafePort cafePort;

    public List<Cafe> findAllCafe() {return cafePort.findAllCafe();}
    public boolean saveCafe(Cafe cafe){return cafePort.saveCafe(cafe);}
    public Cafe findCafe(int cafeId) {
        return cafePort.findCafe(cafeId);
    }
    public boolean saveData(Cafe cafe) {
        return cafePort.saveData(cafe);
    }
}
