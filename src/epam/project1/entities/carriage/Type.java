package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public enum Type {
    RESERVED_SEAT(1), COMPARTMENT(2), LUX(3);

    private int comfortableness;

    public int getComfortableness() {
        return comfortableness;
    }

    Type(int comfortableness){
        this.comfortableness = comfortableness;
    }
}
