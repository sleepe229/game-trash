package Laba121;

public class Vehicle {
    protected int passengers;

    protected Vehicle (int passengers) throws Exception {this.setPassengers(passengers);}

    public void setPassengers(int passengers) throws Exception {if(passengers < 0) throw new Exception("Количество пассажиров должно быть положительным");
    else if (passengers == 0) throw new Exception("Необходим хотя бы один пассажир"); else this.passengers = passengers;}

}
