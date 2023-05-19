package Laba124;

public class Wizard extends Hero{
    private int mana;
    private int spellPower;

    public Wizard(String name, int level, int mana, int spellPower) throws Exception {
        super(name, level);
        if (mana < 1 || mana > 100) {
            throw new IllegalArgumentException("Wrong value to wizard’s mana");
        }
        this.setMana(mana);
        if (spellPower < 0 || spellPower > mana) {
            throw new IllegalArgumentException("Wrong value to wizard’s spell power");
        }
        this.setSpellPower(spellPower);
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
    @Override
    public String action(){
        if(spell()) {
            mana -= spellPower;
            return String.format("%s spell with power %s%n", username, spellPower);
        }
        else
            return String.format("Wizard %s has no more mana%n", username);

    }
    private boolean spell() {
        if (mana != 0) {
            return mana - spellPower >= 0;
        }
        return false;
    }
}
