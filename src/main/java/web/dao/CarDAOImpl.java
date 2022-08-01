package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> showSomeCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Opel", 134));
        cars.add(new Car(2, "BMW", 234));
        cars.add(new Car(3, "Renault", 3236));
        cars.add(new Car(4, "Volvo", 4789));
        cars.add(new Car(5, "Nissan", 56757));
        return cars.stream()
                .limit(count)
                .collect(Collectors
                        .toList());
    }
}
