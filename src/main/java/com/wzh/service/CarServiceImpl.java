package com.wzh.service;

import com.wzh.mapper.CarModelMapper;
import com.wzh.model.CarModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl  implements CarService{
    @Resource
    private CarModelMapper carModelMapper;

    @Override
    public List<CarModel> queryCarList() {
        return carModelMapper.queryCarList();
    }

    @Override
    public List<CarModel> countCar() {
        return carModelMapper.countCar();
    }

    @Override
    public List<CarModel> echaer() {
        return carModelMapper.echaer();
    }
}
