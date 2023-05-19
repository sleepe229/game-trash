package Laba123;

public class Rhombus extends Parallelogram{
    public Rhombus(int[] sides) {
        super(sides);
    }
    @Override
    public String getInfo() {
        return String.format("Rhombus contains %s equal sides%n" +
                "Its perimeter is %s", getSidesCount(), getPerimeter());
    }
}
