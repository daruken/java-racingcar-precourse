package racingcar.controller;

import racingcar.model.race.Race;

public class RaceController {
    private final Race race;

    public RaceController() {
        race = new Race();
    }

    public void start() {
        inputCars();
        inputNumberOfAttemptMove();

    }

    private void inputCars() {
        try {
            race.inputCars();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            race.initCars();
            race.inputCars();
        }
    }

    private void inputNumberOfAttemptMove() {
        try {
            race.inputNumberOfAttemptMove();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            race.inputNumberOfAttemptMove();
        }
    }
}
