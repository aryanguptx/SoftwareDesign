package models;
import behaviours.NoFlyBehaviour;
import behaviours.Quack;
import templates.Duck;
public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehaviour = new NoFlyBehaviour();
        this.quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I am a rubber duck!");
    }
}
