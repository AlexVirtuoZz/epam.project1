package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public class ElectricEngine extends Engine {

    int power;

    public ElectricEngine(int power, int performance, String manufacturer, String model) {
        super(performance, manufacturer, model);
        if (power < Limits.NULL.getLimit())
            throw new IllegalArgumentException("Engine power is incorrect");
        this.power = power;
        if (power < performance)
            throw new IllegalArgumentException("Power can't be less then performance");
    }

    @Override
    int produce() {
        return power/getPerformance();
    }

}
