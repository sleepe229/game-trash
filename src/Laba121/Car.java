package Laba121;

public class Car extends Vehicle{
    int horsePower;
    String model;

    public Car(int passengers, int horsePower, String model) throws Exception {
        super(passengers);
        this.setHorsePower(horsePower);
        this.setModel(model);
    }

    private void setHorsePower(int horsePower) throws Exception {
        if (horsePower < 0) throw new Exception("Invalid negative number");
        this.horsePower = horsePower;
    }

    private void setModel(String model) throws Exception {
        if (model.length() <= 2) throw new Exception("Invalid short value");
        this.model= model;
    }
    public void getInfo(){System.out.println(String.format(
            "In a Car %s passengers \n" +
                    "With %s horse power on %s"
            ,passengers, horsePower, model));}
}
