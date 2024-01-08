package com.vti.Hshop.repository;

import com.vti.Hshop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car, Car.PrimaryKey> {

}
