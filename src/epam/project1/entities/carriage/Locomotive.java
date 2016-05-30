package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public class Locomotive extends Carriage{
    Engine engine;
    int energy;


    public Locomotive(int wheelsQuantity, int capacity) {
        super(wheelsQuantity, capacity);
    }



}
