package racingcar.model.car.collection;

import racingcar.model.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
