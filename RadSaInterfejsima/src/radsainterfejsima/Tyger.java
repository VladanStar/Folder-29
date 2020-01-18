
package radsainterfejsima;


public class Tyger extends Cat implements SwimmingAbility{
    
    public Tyger(String name, String color) {
        super(name, color);
    }
     @Override
    public String makeNoise() {
       return "Roar";
    }

    @Override
    public void swim() {
        System.out.println("I am swimming " + makeNoise());
    }
    
}
