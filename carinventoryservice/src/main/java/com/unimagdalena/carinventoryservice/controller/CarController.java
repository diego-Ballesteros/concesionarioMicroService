package com.unimagdalena.carinventoryservice.controller;

import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSend;
import com.unimagdalena.carinventoryservice.service.interfaces.ICarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("1.0/car")
public class CarController {
    private final ICarService iCarService;

    public CarController(ICarService iCarService) {
        this.iCarService = iCarService;
    }
    @GetMapping("/available")
    public ResponseEntity <List<CarDtoSend>> getAvailable(){
        return ResponseEntity.ok(this.iCarService.findByAvaliableTrue());
    }
}
