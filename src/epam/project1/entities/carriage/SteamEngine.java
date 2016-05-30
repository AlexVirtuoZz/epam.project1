package epam.project1.entities.carriage;

import java.util.Random;

/**
 * Created by Alex on 30.05.2016.
 */
public class SteamEngine extends Engine {

    private int coalStock;

    public int getCoalStock() {
        return coalStock;
    }

    public SteamEngine(int coalStock, int performance, String manufacturer, String model) {
        super(performance, manufacturer, model);
        if (coalStock < Limits.NULL.getLimit())
            throw new IllegalArgumentException("Incorrect coal stock quantity. Must be greater equals null");
        this.coalStock = coalStock;
    }

    @Override
    int produce() {
        checkCoalStock();
        int consume = new Random().nextInt()*10;
        coalStock -= consume;
        return getPerformance() * consume;
    }

    public void checkCoalStock() {
        if (coalStock <= 0)
            throw new Error("Coal stock is empty! Train can't move on");
    }
}
