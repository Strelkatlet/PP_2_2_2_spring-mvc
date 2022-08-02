package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO car;

    @Autowired
    public CarServiceImpl(CarDAO car) {
        this.car = car;
    }

    @Override
    public List<Car> showSomeCars(Integer count) {
        return car.showSomeCars(count);
    }
}
