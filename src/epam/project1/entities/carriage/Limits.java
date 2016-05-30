package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public enum Limits {

    MIN_WHEELS(4), MAX_WHEEL(20), MIN_NUMBER(1), MIN_CAPACITY(2), MAX_CAPACITY(72),
    NULL(0), MAX_WEAROUT(100);

    private int limit;

    int getLimit(){
        return limit;
    }

    Limits(int limit){
        this.limit = limit;
    }
}
