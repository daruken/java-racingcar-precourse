package racingcar.model.car.wrap_variable;

public class Distance {
    private int distance;

    public Distance() {
        this.distance = 0;
    }

    public void plusDistance() {
        this.distance++;
    }

    public int getDistance() {
        return this.distance;
    }
}
