package Laba123;

public class Circle extends Polygon {
    public Circle(int[] sides) {
        super(sides);
    }

    private double getArea() {
        return Math.PI * Math.pow(sides[0], 2);
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*sides[0];
    }

    @Override
    public String getInfo() {
        return String.format("Circle radius is %s%nIts perimeter is %.2f%nIts area is %.2f",
                sides[0], getPerimeter(), getArea());
    }
}
