package com.wzh.controller;

import com.wzh.model.CarModel;
import com.wzh.service.CarService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("car")
public class CarController {
    @Resource
    private CarService carService;
    @RequestMapping("queryCarList")
    @ResponseBody
    public List queryCarList(){
        List<CarModel> car = carService.queryCarList();
        return car;
    }
    @RequestMapping("toecharts")
    public ModelAndView toecharts(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("showdemo");
        return mv;
    }
    @RequestMapping("countCar")
    @ResponseBody
    public Map countCar(){
        Map<String,Object> map = new HashMap();
        List<CarModel> carList = carService.countCar();
        List<String> names = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for (int i =0;i<carList.size();i++){
            names.add(carList.get(i).getCname());
            values.add(carList.get(i).getCcount());
        }
        map.put("name",names);
        map.put("value",values);
        return map;

    }
    @RequestMapping("echaer")
    @ResponseBody
    public  Map  echaer(){
        Map<String,Object> map = new HashMap();
        List<CarModel> carList = carService.echaer();
        List<String> week = new ArrayList<>();
        List<Integer> ccount = new ArrayList<>();
        for (int i = 0; i<carList.size(); i++){
            week.add(carList.get(i).getWeek());
            ccount.add(carList.get(i).getCcount());

        }
        map.put("weeked",week);
        map.put("ccount",ccount);


        return map;
    }

    @RequestMapping("Five")
    @ResponseBody
    public Map five(){
        Map<String,Object> map = new HashMap();
        List<CarModel> carList = carService.echaer();
        List<String> name = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i<carList.size(); i++){
            name.add(carList.get(i).getWeek());
            value.add(carList.get(i).getCcount());

        }
        map.put("name",name);
        map.put("value",value);
        return map;
    }
 }
