package com.vti.Hshop.controller;

import com.vti.Hshop.dto.CarDto;
import com.vti.Hshop.entity.Car;
import com.vti.Hshop.form.CarCreateForm;
import com.vti.Hshop.form.CarUpdateForm;
import com.vti.Hshop.service.CarService;
import com.vti.Hshop.service.CarServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@AllArgsConstructor
@CrossOrigin("http://127.0.0.1:5500/")
public class CarController {
    private final CarService carService;

    @GetMapping("api/v1/cars")
    public Page<CarDto> findAll (Pageable pageable){
        return carService.findAll(pageable);
    }


    @PostMapping("/api/v1/cars")
    public CarDto create (@RequestBody @Valid CarCreateForm form){
        return carService.create(form);
    }


    @PutMapping("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form){

        return carService.update(form);
    }

    @DeleteMapping("/api/v1/cars")
    public  void deleteById(@RequestBody  Car.PrimaryKey id){
        carService.deleteById(id);

    }
}
