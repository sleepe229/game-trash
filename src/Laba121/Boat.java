package Laba121;

public class Boat extends Vehicle{
    private int oarsCount;
    public Boat(int passengers, int oarsCount) throws Exception {
        super(passengers);
        this.setOarsCount(oarsCount);
    }

    private void setOarsCount(int oarsCount) throws Exception {
        if(oarsCount < 0) throw new Exception("Invalid negative number");
        else if (oarsCount == 0) throw new Exception("Need oars to swim" );
        else if (oarsCount/2 > passengers) throw new Exception("One too many oars");
        this.oarsCount = oarsCount;
    }

    public void getInfo(){System.out.println(String.format(
            "In a Boat %s passengers\n" +
                    "With %s oars"
            ,passengers, oarsCount));}
}
