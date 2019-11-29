/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 29/11/2019
 */

public class FirePokemon extends Pokemon implements CanFly{

    public void spyIld() {
        System.out.println("Whoaaaaa!");
    }


    @Override
    public void fly() {
        System.out.println("Spyr ild og flyver på den måde.");
    }
}
