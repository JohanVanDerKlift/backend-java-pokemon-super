public class GrassPokemon extends Pokemon {
    private int height;
    private int weight;

    public GrassPokemon(String name, int level, int height, int weight) {
        super(name, level);
        this.height = height;
        this.weight = weight;
    }

    public void pound() {
        System.out.println(super.getName() + " is able to throw a punch");
    }

    public void hornAttack() {
        System.out.println(super.getName() + " attacks you with it's horns");
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says: I'm a Grass Pokemon");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
