package Laba103;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String calculateSurfaceArea() {
        return String.format("%.2f", 2 * length * width + 2 * width * height + 2 * height * length);
    }

    public String calculateLateralSurfaceArea() {
        return String.format("%.2f", 2 * width * height + 2 * height * length);
    }

    public String calculateVolume() {
        return String.format("%.2f", length * width * height);
    }

    public String getInfo() {
        return String.format(
                "Surface Area – %s\n" +
                        "Lateral Surface Area – %s\n" +
                        "Volume – %s\n",
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume()
        );
    }
}
