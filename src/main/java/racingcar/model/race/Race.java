package racingcar.model.race;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.Message;
import racingcar.model.car.Car;
import racingcar.model.car.collection.Cars;
import racingcar.model.race.wrap_variable.Input;
import racingcar.model.race.wrap_variable.NumberOfAttemptMove;

public class Race {
    private Cars cars;
    private NumberOfAttemptMove numberOfAttemptMove;

    public Race() {
        this.cars = new Cars();
    }

    public void initCars() {
        this.cars = new Cars();
    }

    public void inputCars() {
        System.out.println(Message.INPUT_RACE_CARS_NAME);
        Input input = new Input(Console.readLine());
        generateRaceCars(input);
    }

    public void inputNumberOfAttemptMove() {
        System.out.println(Message.INPUT_NUMBER_OF_ATTEMPT);
        Input input = new Input(Console.readLine());
        numberOfAttemptMove = new NumberOfAttemptMove(input.getInput());
    }

    private void generateRaceCars(Input input) {
        for (String token : input.getInput().split(",")) {
            cars.addCar(new Car(token));
        }
    }
}
