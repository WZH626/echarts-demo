package com.wzh.mapper;

import com.wzh.model.CarModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarModelMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(CarModel record);

    int insertSelective(CarModel record);

    CarModel selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(CarModel record);

    int updateByPrimaryKey(CarModel record);
    @Select("select * from t_car")
    List<CarModel> queryCarList();
    @Select("select cName , cCount   from t_car  group by cName  order by cCount desc "  )
    List<CarModel> countCar();
    @Select("select week,ccount from t_car ")
    List<CarModel> echaer();
}