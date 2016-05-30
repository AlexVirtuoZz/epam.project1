package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public class PassengerCarriage extends Carriage {
    private Type comfortableness;
    int number;

    public Type getComfortableness() {
        return comfortableness;
    }

    public void setComfortableness(Type comfortableness) {
        this.comfortableness = comfortableness;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PassengerCarriage(int number, Type comfortableness, int wheels, int capacity){
        super(wheels, capacity);
        if (number < Limits.MIN_NUMBER.getLimit())
            throw new IllegalArgumentException("Incorrect carriage number");
        this.number = number;
        this.comfortableness = comfortableness;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append("Carrier number is ").append(number).append(". Used for passenger delivery\n")
                .append("Comfort type ")
                .append(comfortableness.toString()).toString();
    }
}
