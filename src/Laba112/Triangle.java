package Laba112;

public class Triangle {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    private static boolean isValid(double minvalue) throws Exception {
        if (minvalue > 0) return true;
        else throw new Exception("value cannot be zero or negative");
    }

    private static boolean isTriangle(double sideA, double sideB, double sideC) throws Exception {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            return true;
        } else throw new Exception("Triangle  cann`t  have  sum  of  two sides less than third side");
    }

    public double calculateArea() {
        double semiperimeter = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - this.sideA) * (semiperimeter - this.sideB) * (semiperimeter - this.sideC));
    }

    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public String getInfo() throws Exception {
        if (Triangle.isValid(this.sideA) && Triangle.isValid(this.sideB) && Triangle.isValid(this.sideC) && Triangle.isTriangle(this.sideA, this.sideB, this.sideC)){
        return String.format(
                "Perimeter – %s\n" +
                        "Area – %s\n",
                calculatePerimeter(),
                calculateArea()
        );}
        else throw new Exception("razrab debil exception");
    }
}