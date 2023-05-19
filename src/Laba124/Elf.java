package Laba124;

public class Elf extends Hero{
    private int arrowsCount;

    public Elf(String name, int level, int arrowsCount) throws Exception {
        super(name, level);
        this.setArrowsCount(arrowsCount);
    }

    private void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    @Override
    public String action(){
        if(shootArrow()){
            arrowsCount-=1;
            return String.format("%s shoot arrow%n", username);
        }
        else
            return String.format("Elf %s has no more arrow%n", username);

    }
    private boolean shootArrow() {
        if (arrowsCount != 0) {
            return arrowsCount - 1 >= 0;
        }
        return false;
    }
}
