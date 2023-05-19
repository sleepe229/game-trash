package Laba123;

import java.util.Arrays;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides){
        this.sides = sides;
    }

    protected int getSidesCount(){
        return this.sides.length;
    }
    protected double getPerimeter(){
        return Arrays.stream(this.sides).sum();
    }
    public static Polygon createPolygon(String side) throws Exception{
        int[] sidesOfPolygon = Arrays.stream(side.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (Arrays.stream(sidesOfPolygon).sorted().toArray()[0] < 0) throw new Exception("Negative value to side length");
        if (Arrays.stream(sidesOfPolygon).sum() - Arrays.stream(sidesOfPolygon).sorted().toArray()[sidesOfPolygon.length-1] < Arrays.stream(sidesOfPolygon).sorted().toArray()[sidesOfPolygon.length-1] && sidesOfPolygon.length > 1) throw new Exception("Wrong value to side length");

        if (sidesOfPolygon.length == 3){
            return new Triangle(sidesOfPolygon);
        } else if (sidesOfPolygon.length == 1) {
            return new Circle(sidesOfPolygon);
        } else if (sidesOfPolygon.length >= 5) {
            return new Polygon(sidesOfPolygon);
        } else if (sidesOfPolygon.length == 4) {
            if (sidesOfPolygon[0] == sidesOfPolygon[2] ||
                    sidesOfPolygon[1] == sidesOfPolygon[3]){
                return new Parallelogram(sidesOfPolygon);
            } else if (Arrays.stream(sidesOfPolygon).sorted().toArray()[0] == Arrays.stream(sidesOfPolygon).sorted().toArray()[2]){
                return new Rhombus(sidesOfPolygon);
            } else throw new Exception("razrab debil exception");
        } else throw new Exception("Invalid value to sides number");
    }

    public String getInfo(){
        return String.format("Polygon contains %s sides\n" +
                "Its perimeter is %s", getSidesCount(), getPerimeter());
    }
}
