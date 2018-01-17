package DP4_BuilderPattern;

public abstract class Burger implements Item {

    private Wrapper wrapper;

    @Override
    public Packing packing() {
        if (wrapper == null) {
            wrapper = new Wrapper();
        }
        return wrapper;
    }
}
