package DP4_BuilderPattern;

public abstract class ColdDrink implements Item {

    private Bottle bottle;

    @Override
    public Packing packing() {
        if (bottle == null) {
            bottle = new Bottle();
        }
        return bottle;
    }
}
