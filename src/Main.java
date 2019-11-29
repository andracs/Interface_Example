
/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 29/11/2019
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Interface eksempel");

        FirePokemon pikachu = new FirePokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setGender("han");
        pikachu.setSkade((short) 80);
        pikachu.setNummerPokedex(25);

        System.out.println(pikachu.toString());
        pikachu.spyIld();
        pikachu.spyIld();

    }

}
