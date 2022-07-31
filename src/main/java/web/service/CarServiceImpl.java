package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarDAO CAR_DAO;

    @Autowired
    public CarServiceImpl(CarDAO car_dao) {
        CAR_DAO = car_dao;
    }

    @Override
    public List<Car> getCar(Integer count) {
        return CAR_DAO.getCar(count);
    }
}
