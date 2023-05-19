package Laba121;

public class Airplane extends Vehicle{
    private int wingsCount;
    private int enginesNumber;
    private boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int enginesNumber, boolean isHydroplane) throws Exception {
        super(passengers);
        this.setWingsCount(wingsCount);
        this.setEnginesNumber(enginesNumber);
        this.setHydroplane(isHydroplane);
    }

    private void setWingsCount(int wingsCount) throws Exception {
        if(wingsCount < 0)
            throw new Exception("Invalid negative number");
        else if (wingsCount == 0)
            throw new Exception("Need wings to fly");
        this.wingsCount = wingsCount;
    }
    private void setEnginesNumber(int enginesNumber) throws Exception {
        if(enginesNumber < 0)
            throw new Exception("Invalid negative number");
        else if (enginesNumber == 9 || enginesNumber == 11 || enginesNumber > 12)
            throw new Exception("Invalid engines number");
        this.enginesNumber = enginesNumber;
    }
    private void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }
    public void getInfo(){
        if (isHydroplane)
            System.out.println(String.format(
                "In a Hydroplane %s passengers\n" +
                        "With %s wings and %s engines"
                ,passengers, wingsCount, enginesNumber));
        else
            System.out.println(String.format(
                "In an Airplane %s passengers\n" +
                "With %s wings and %s engines"
                ,passengers, wingsCount, enginesNumber));

    }
}
