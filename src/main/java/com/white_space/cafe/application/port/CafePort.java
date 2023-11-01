package com.white_space.cafe.application.port;

import com.white_space.cafe.dto.Cafe;

import java.util.List;

public interface CafePort {
    boolean saveCafe(Cafe cafe);
    List<Cafe> findAllCafe();
    Cafe findCafe(int cafeId);
    boolean saveData(Cafe cafe);
}
