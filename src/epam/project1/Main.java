package epam.project1;


import epam.project1.entities.carriage.Carriage;
import epam.project1.entities.carriage.PassengerCarriage;
import epam.project1.entities.carriage.Type;

/**
 * Created by Alex on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Carriage vagon = new PassengerCarriage(1, Type.LUX, 4, 2);

    }
}
