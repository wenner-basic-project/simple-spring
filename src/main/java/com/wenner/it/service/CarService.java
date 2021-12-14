package com.wenner.it.service;

import com.wenner.it.entity.Car;

public class CarService {

    public String productionCar(String brand, String color){
        Car car = new Car();
        car.setBrand(brand);
        car.setColor(color);
        return car.toString();
    }
}
