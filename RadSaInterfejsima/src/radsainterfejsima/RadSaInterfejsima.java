package radsainterfejsima;

import java.util.LinkedList;
import java.util.List;

public class RadSaInterfejsima {

    public static void main(String[] args) {

        List<Animal> animals = new LinkedList<>();
        animals.add(new Cat("Acika", "white yellow"));
        animals.add(new Tyger("Simba", "yellow"));
        animals.add(new Fish("Rockey", "blue"));

        for (Animal animal : animals) {
            if (animal instanceof ClimbingAbility) {
                ((ClimbingAbility) animal).climb();
            }

            if (animal instanceof FlyingAbility) {
                ((FlyingAbility) animal).fly();

            }

            if (animal instanceof SwimmingAbility) {
                ((SwimmingAbility) animal).swim();
            }
            if (animal instanceof FlyingAbility) {
                ((FlyingAbility) animal).fly();
                ((FlyingAbility) animal).land();
            }

        }

    }

}
