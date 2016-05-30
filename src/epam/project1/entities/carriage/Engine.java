package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
abstract class Engine {
    private int performance;
    private String manufacturer;
    private String model;

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine(int performance, String manufacturer, String model) {
        if (performance < Limits.NULL.getLimit())
            throw new IllegalArgumentException("Engine performance is incorrect");
        this.performance = performance;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    abstract int produce();


}
