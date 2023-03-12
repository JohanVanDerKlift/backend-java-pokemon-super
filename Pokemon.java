public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void speaks() {
        System.out.println(getName() + " speaks");
    }

    public void eats() {
        System.out.println(getName() + " eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
