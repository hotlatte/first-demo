package com.tim.sbootweb.service;

import com.tim.sbootweb.entity.Car;
import java.util.List;

public interface CarService {


    /**
     * 新增car
     */

    boolean addCar(Car car);

    /**
     * 修改用户
     * @param car
     * @return
     */
    boolean updateCar(Car car);


    /**
     * 删除用户
     * @param car
     * @return
     */
    boolean deleteCar(Long id);

    /**
     * 根据用户名字查询用户信息
     * @param car
     */
    Car findUserById(Long id);
    /**
     * 查询所有
     * @return
     */
    List<Car> findAll();
}


