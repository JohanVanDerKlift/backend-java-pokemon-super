public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Pyro", 5, "Peppers", "Yeehaa");
        WaterPokemon waterPokemon = new WaterPokemon("Hydro", 6, 10, 50);
        GrassPokemon grassPokemon = new GrassPokemon("Greeny", 4, 10, 20);
        ElectricPokemon electricPokemon = new ElectricPokemon("Bolt", 8, 10, 10);

        firePokemon.eats();
        firePokemon.speaks();
        firePokemon.inferno();
        firePokemon.pyroBall();

        waterPokemon.eats();
        waterPokemon.speaks();
        waterPokemon.hydroCanon();
        waterPokemon.surf();

        grassPokemon.eats();
        grassPokemon.speaks();
        grassPokemon.hornAttack();
        grassPokemon.pound();

        electricPokemon.eats();
        electricPokemon.speaks();
        electricPokemon.thunderPunch();
        electricPokemon.voltTackle();
    }
}
