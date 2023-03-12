public class WaterPokemon extends Pokemon {
    private int hp;
    private int xp;

    public WaterPokemon(String name, int level, int hp, int xp) {
        super(name, level);
        this.hp = hp;
        this.xp = xp;
    }

    public void surf() {
        System.out.println(super.getName() + " surfs around");
    }

    public void hydroCanon() {
        System.out.println(super.getName() + " shoots a hydrocanon");
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says: I'm a Water Pokemon");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
