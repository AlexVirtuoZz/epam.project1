package epam.project1.entities.carriage;

/**
 * Created by Alex on 30.05.2016.
 */
public class Wheel {
    private int wearout;

    public boolean needRepair(){
        if (this.wearout > 60)
            return true;
        return false;
    }

    public void deteriorate(){
        this.wearout += Math.random()*10;
        if (wearout > Limits.MAX_WEAROUT.getLimit())
            throw new Error("Wheel has been broken! Train can't move on");
    }

    public void repair(){
        this.wearout = 0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Wheel wearout is ").append(wearout).append(" %").
                append(needRepair() ? "\nNeed repair!" : "").toString();
    }
}
