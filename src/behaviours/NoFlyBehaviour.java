package behaviours;

import interfaces.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {

    @Override
   public void fly(){
        System.out.println(" I can't fly :( ");
    }
}
