package Laba111;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws Exception {
        this.height = height;
        this.width = width;
        this.length = length;
//        if (height <= 0 || width <= 0|| length <= 0) { throw new Exception("value cannot be zero or negative");}
    }

    public String calculateSurfaceArea() {
        double value = 2 * this.length * this.width + 2 * this.width * this.height
                + 2 * this.height * this.length;
        return String.format("%.2f", value);
    }

    public String calculateLateralSurfaceArea() {
        double value = 2 * this.width * this.height + 2 * this.height * this.length;
        return String.format("%.2f", value);
    }

    public String calculateVolume() {
        double value = this.length * this.width * this.height;
        return String.format("%.2f", value);
    }
    private boolean isValid(double trash){
        if (trash > 0) return false;
        else return true;
    }
    public String getInfo() {
        if (isValid(this.length))
            return "length cannot be zero or negative";
        else if (isValid(this.width))
            return "width cannot be zero or negative";
        else if (isValid(this.height))
            return "height cannot be zero or negative";
        else
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

