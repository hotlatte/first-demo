package com.tim.sbootweb.controller;

import com.tim.sbootweb.entity.Car;
import com.tim.sbootweb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author kyle
 * @version 1.0
 * @className
 * @descripsion TODO
 * @date 2018/8/4 23:13
 */
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        System.out.println("查询所有");
        List<Car> cars=carService.findAll();
        model.addAttribute("cars", cars);
        return "cars/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "cars/carAdd";
    }

    @RequestMapping("/add")
    public String add(Car car) {
        carService.addCar(car);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        Car car=carService.findUserById(id);
        model.addAttribute("car", car);
        return "cars/carEdit";
    }

    @RequestMapping("/edit")
    public String edit(Car car) {
        carService.updateCar(car);
        return "redirect:/list";
    }


    @RequestMapping("/toDelete")
    public String delete(Long id) {
        carService.deleteCar(id);
        return "redirect:/list";
    }


}
