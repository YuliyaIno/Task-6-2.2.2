package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList = List.of(
            new Car("VAZ 2110", "White", 50000),
            new Car("VAZ 2111", "Black", 60000),
            new Car("VAZ 2112", "Gray", 70000),
            new Car("VAZ 2113", "Red", 80000),
            new Car("VAZ 2110", "Green", 90000));

    @Override
    public List<Car> getCountCars() {
        return new ArrayList<>(carList);
    }
}
