package com.vti.Hshop.service;

import com.vti.Hshop.dto.CarDto;
import com.vti.Hshop.entity.Car;
import com.vti.Hshop.form.CarCreateForm;
import com.vti.Hshop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey id);
}
