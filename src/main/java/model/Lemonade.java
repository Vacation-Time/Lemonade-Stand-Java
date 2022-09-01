package model;

public class Lemonade {

    private double lemonJuice; // notice it is set to 'private'
    private double water;
    private double sugar;
    private int iceCubes;

    private final int CUP = 1;  // how to create a CONSTANT VARIABLE in Java, using 'final' in front means it will NOT be able to be reassigned.

    private double price;

    public Lemonade(double lemonJuice, double water, double sugar, int iceCubes) {
        super();
        this.lemonJuice = lemonJuice;
        this.water = water;
        this.sugar = sugar;
        this.iceCubes = iceCubes;
        calculateTotalPrice();
    }

    private void calculateTotalPrice() {
        price = (lemonJuice * 0.3) + (sugar * 0.15) + (CUP * 0.50);
    }

    public double getLemonJuice() {
        return lemonJuice;
    }

    public double getWater() {
        return water;
    }

    public double getSugar() {
        return sugar;
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public int getCUP() {
        return CUP;
    }

    public double getPrice() {
        return price;
    }
}
