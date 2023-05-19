package Laba124;

public class Knight extends Hero{
    private int strength;
    private int forcePower;

    public Knight(String name, int level, int strength, int forcePower) throws Exception {
        super(name, level);
        this.setStrength(strength);
        this.setForcePower(forcePower);
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private void setForcePower(int forcePower) {
        this.forcePower = forcePower;
    }

    @Override
    public String action(){
        if(fight()) {
            strength -= forcePower;
            return String.format("%s fight with power %s%n", username, forcePower);
        }
        else
            return String.format("Knight %s has no more strength%n", username);

    }
    private boolean fight() {
        if (strength != 0) {
            return strength - forcePower >= 0;
        }
        return false;
    }

}
