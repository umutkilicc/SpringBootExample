package service;

import entity.Car;
import entity.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CarRepository;
import repository.HumanRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private final CarRepository carRepository;
    @Autowired
    private final HumanRepository humanRepository;

    public CarService(CarRepository carRepository, HumanRepository humanRepository) {
        this.carRepository = carRepository;
        this.humanRepository = humanRepository;
    }


}
