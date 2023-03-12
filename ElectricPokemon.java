public class ElectricPokemon extends Pokemon {
    private int defence;
    private int attack;

    public ElectricPokemon(String name, int level, int defence, int attack) {
        super(name, level);
        this.defence = defence;
        this.attack = attack;
    }

    public void thunderPunch() {
        System.out.println(super.getName() + " makes a thunderpunch.");
    }

    public void voltTackle() {
        System.out.println(super.getName() + " makes an electric tackle");
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says: I'm a Electric Pokemon");
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
