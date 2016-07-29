package it.morfoza.java101.pokemon;


public class Main {


    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon("Pikachu", 100);
        Pokemon pokemon2 = new Pokemon("Charizard", 200);
        Pokemon pokemon3 = new Pokemon("Bulbasaur", 300);

        System.out.println();

        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
//        pokemon.takeAttack(1000);


        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        if (pokemon.isAllive()) {
            System.out.println("Pokemon is allive");
        } else {
            System.out.println("Pokemon is unconcious");
        }
        

        System.out.println(pokemon);
    }
}
