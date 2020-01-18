
package radsainterfejsima;


public class Bird extends Animal implements FlyingAbility{

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeNoise() {
        return "Chiu chiu";
    }

    @Override
    public void fly() {
        System.out.println("I am flaying  " + makeNoise());
    }

    @Override
    public void land() {
        System.out.println("I am landing" + makeNoise());
    }
    
}
