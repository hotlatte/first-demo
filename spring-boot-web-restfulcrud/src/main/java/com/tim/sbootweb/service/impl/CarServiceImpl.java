package com.tim.sbootweb.service.impl;

import com.tim.sbootweb.dao.CarDao;
import com.tim.sbootweb.entity.Car;
import com.tim.sbootweb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kyle
 * @version 1.0
 * @className
 * @descripsion TODO
 * @date 2018/8/4 23:09
 */

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public boolean addCar(Car car) {
        boolean flag=false;
        try{
            carDao.save(car);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateCar(Car car) {
        boolean flag=false;
        try{
            carDao.save(car);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteCar(Long id) {
        boolean flag=false;
        try{
            carDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Car findUserById(Long id) {
        return carDao.findOne(id);
    }

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }
}
