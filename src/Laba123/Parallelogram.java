package Laba123;

import java.util.Arrays;

public class Parallelogram extends Quadrilateral{
    public Parallelogram(int[] sides) {
        super(sides);
    }

    @Override
    public String getInfo(){
        return String.format("Parallelogram contains two pairs of parallel sidesIts perimeter is %s", getPerimeter());
    }
}
