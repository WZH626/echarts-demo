package com.wzh.service;

import com.wzh.model.CarModel;

import java.util.List;

public interface CarService {
    List<CarModel> queryCarList();

    List<CarModel> countCar();

    List<CarModel> echaer();
}
