package Laba124;

public class Hero {
    protected String username;
    protected int level;

    protected Hero(String username, int level) throws Exception {
        this.setUsername(username);
        this.setLevel(level);
    }

    private void setUsername(String username) throws Exception {
        if (username.length() < 5) throw new Exception("Wrong value to hero’s username");
        this.username = username;
    }
    private void setLevel(int level) throws Exception {
        if (level < 0) throw new Exception("Wrong value to hero’s level");
        this.level = level;
    }

    public String action(){
        return "string";
    }
    public String endingGame() {
        return String.format("%s %s [%d level] is offline", this.getClass().getSimpleName(), this.username, this.level);
    }

    public static Hero createHero(String string) throws Exception {
        String[] strings = string.split(" ");
        String heroClass = strings[1];
        String username = strings[2];
        int level = Integer.parseInt(strings[3]);
        System.out.printf("%s %s [%s level] is online%n", heroClass, username, level);
        switch (heroClass) {
            case "Wizard" -> {
                int mana = Integer.parseInt(strings[4]);
                int spellPower = Integer.parseInt(strings[5]);
                return new Wizard(username, level, mana, spellPower);
            }
            case "Elf" -> {
                int arrowsCount = Integer.parseInt(strings[4]);
                return new Elf(username, level, arrowsCount);
            }
            case "Knight" -> {
                int strength = Integer.parseInt(strings[4]);
                int forcePower = Integer.parseInt(strings[5]);
                return new Knight(username, level, strength, forcePower);
            }
            default -> throw new IllegalArgumentException("Unknown hero class: " + heroClass);
        }
    }
}
