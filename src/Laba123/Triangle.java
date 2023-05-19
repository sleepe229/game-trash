package Laba123;

public class Triangle extends Polygon{
    public Triangle(int[] sides) {
        super(sides);
    }
    private double getInRadius(){
        return Math.sqrt((-sides[0]+sides[1]+sides[2])*(sides[0]-sides[1]+sides[2])*(sides[0]+sides[1]-sides[2])) / Math.sqrt(4*(sides[0]+sides[1]+sides[2]));
    }
    @Override
    public String getInfo() {
        return String.format("Triangle contains %s sides%n" +
                "Its perimeter is %s%n" +
                "Its radius of incircle is %.2f", getSidesCount(), getPerimeter(), getInRadius());
    }
}
