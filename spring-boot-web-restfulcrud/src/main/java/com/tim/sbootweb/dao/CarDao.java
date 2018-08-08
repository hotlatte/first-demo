package com.tim.sbootweb.dao;

import com.tim.sbootweb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarDao extends JpaRepository<Car,Long> {

}
