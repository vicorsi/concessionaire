package com.concessionaire.system.concessionaire.controllers;

import com.concessionaire.system.concessionaire.car.CarDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @PostMapping
    public void registerCar(@RequestBody CarDto carDto){
        System.out.println(carDto);
    }
}
