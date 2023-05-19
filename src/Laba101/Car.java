package Laba101;

public class Car {
    private String make;
    private String model;
    private int horsePower;

    public Car(String make) {this.make = make; this.model = "unknown"; this.horsePower = -1;}
    public Car(String make, String model, int horsePower) {this.make = make; this.model = model; this.horsePower = horsePower;}

    public String getMake(){return this.make;}
    public int getHorsePower() {return this.horsePower;}
    public String getModel() {return this.model;}


    public String getInfo(){
        return String.format(
                "The car is %s %s - %d HP.",
                getMake(), getModel(), getHorsePower()
        );
    }
}