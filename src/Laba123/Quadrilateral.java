package Laba123;

public class Quadrilateral extends Polygon{
    public Quadrilateral(int[] sides){
        super(sides);
    }
    @Override
    public String getInfo(){
        return String.format("Quadrilateral contains %s sides%n" +
                "Its perimeter is %s", getSidesCount(), getPerimeter());
    }
}
