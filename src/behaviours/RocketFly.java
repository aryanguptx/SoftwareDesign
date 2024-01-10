package behaviours;

import interfaces.FlyBehaviour;

public class RocketFly implements FlyBehaviour {
    @Override
    public void fly(){
        System.out.println("I'm flying into space!");
    }
}
