package behaviours;

import interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack(){
        System.out.println("Quack Quack!!");
    }
}
