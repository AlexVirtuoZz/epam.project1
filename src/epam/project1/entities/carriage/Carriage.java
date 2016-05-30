package epam.project1.entities.carriage;

import java.util.ArrayList;

/**
 * Created by Alex on 30.05.2016.
 */
public abstract class Carriage {
    private final ArrayList<Wheel> WHEELS;
    private final int CAPACITY;

    public ArrayList<Wheel> getWHEELS() {
        return WHEELS;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public Carriage(int wheelsQuantity, int capacity){
        if (wheelsQuantity > Limits.MAX_WHEEL.getLimit() || wheelsQuantity < Limits.MIN_WHEELS.getLimit() || wheelsQuantity % 2 != 0)
            throw new IllegalArgumentException("Incorrect wheels quantity");
        else if (capacity > Limits.MAX_CAPACITY.getLimit() || capacity < Limits.MIN_CAPACITY.getLimit())
            throw new IllegalArgumentException("Incorrect capacity");

        WHEELS = new ArrayList(wheelsQuantity);
        for (int i = 0; i < wheelsQuantity; i++)
            WHEELS.add(new Wheel());
        this.CAPACITY = capacity;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("A carriage with ").append(WHEELS.size()).append(" wheels\n")
                .append("Can accommodate ").append(CAPACITY).append(" people.\n").toString();
    }
}
