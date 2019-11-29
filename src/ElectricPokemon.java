import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.TreeVisitor;

import java.lang.annotation.ElementType;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 29/11/2019
 */

public class ElectricPokemon extends Pokemon implements EX, CanFly {

    public void givStod() {
        System.out.println("Whoaaaaa!");
    }

    @Override
    public void ex() {
        System.out.println("Jeg er ekstra sej.");
    }

    @Override
    public void fly() {
        System.out.println("Jeg bruger min elektricitet til at flyve. ");
    }

}
