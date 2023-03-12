public class FirePokemon extends Pokemon {
    private String food;
    private String sound;

    public FirePokemon(String name, int level, String food, String sound) {
        super(name, level);
        this.food = food;
        this.sound = sound;
    }

    public void inferno() {
        System.out.println(super.getName() + " generates a inferno");
    }

    public void pyroBall() {
        System.out.println(super.getName() + " shout a pyroball");
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says: I'm a Fire Pokemon");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
