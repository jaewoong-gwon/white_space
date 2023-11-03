package com.white_space.cafe.controller;

import com.white_space.cafe.dto.OnCreateCateDto;
import com.white_space.cafe.dto.OnUpdateRemainSeatDto;
import com.white_space.cafe.service.CafeService;
import com.white_space.cafe.dto.Cafe;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Slf4j
@RequestMapping("/white_space/cafe")
@RequiredArgsConstructor
@RestController
public class CafeController {
    private final CafeService cafeService;

    @PostMapping("")
    public ResponseEntity<?> saveCafe(@RequestPart MultipartFile cafeImage,
                                      @RequestPart Cafe cafe) throws IOException {
        cafe.setCafeImage(cafeImage.getBytes());
        OnCreateCateDto createCateDto = cafe.onCreateCateDto();
        if(cafeService.saveCafe(cafe)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("")
    public ResponseEntity<List<Cafe>> findAllCafe(){ // 카페 리스트 조회
        return ResponseEntity.ok().body(cafeService.findAllCafe());
    }

    @GetMapping("/{cafeId}")
    public ResponseEntity<Cafe> findCafe(@PathVariable int cafeId){
        // 특정 카페 조회
        // 잔여 좌석 등의 데이터 포함하고 있음
        return ResponseEntity.ok().body(cafeService.findCafe(cafeId));
    }

    @PostMapping("/data")
    public ResponseEntity<?> saveData(@RequestBody Cafe cafe){

        OnUpdateRemainSeatDto updateDto = cafe.onUpdateRemainSeatDto();
        // A.I 보드에서 잔여 좌석등의 데이터 등을 갱신
        if(cafeService.saveData(cafe)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

}
