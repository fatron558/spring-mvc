package service;

import models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Opel", 922, "Sam"));
        cars.add(new Car("Volvo", 567, "Alex"));
        cars.add(new Car("KIA", 345, "John"));
        cars.add(new Car("Honda", 278, "Tom"));
        cars.add(new Car("Nissan", 783, "Nolan"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
