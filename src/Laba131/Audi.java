package Laba131;

public class Audi implements Car{
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Audi(String model, String color, int horsePower, String countryProduced){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }
    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %s tires", getModel(), countryProduced, TIRES);
    }
}
